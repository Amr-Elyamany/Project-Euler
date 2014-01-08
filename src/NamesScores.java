import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class NamesScores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] names = new String[5163];
		
		BufferedReader br = null;
		 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("names.txt"));
			int counter = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				
				System.out.println(sCurrentLine);
				names[counter] = sCurrentLine;
				counter++;
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		Arrays.sort(names);
		long sum = 0;
		int word = 0;
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length(); j++) {
				word+=(names[i].charAt(j)-64);
			}
			sum+= ((i+1)*word);
			word = 0;
		}
		System.out.println(sum);
	}

}
