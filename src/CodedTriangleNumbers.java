import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CodedTriangleNumbers {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//65
		BufferedReader br = new BufferedReader(new FileReader("words.txt"));
		String line = br.readLine();
		System.out.println(line);
		String [] words = line.split(",");
		int counter = 0;
		for (int i = 0; i < words.length; i++) {
			int sum = 0;
			for (int j = 1; j < words[i].length()-1; j++) {
				sum += (words[i].charAt(j)-64);
			}
			double x = (-1 + Math.sqrt(1 + 4*2*sum))/2;
			if(Math.ceil(x)==Math.floor(x))
			{
				counter++;
			}
		}
		System.out.println(counter);
	}

}
