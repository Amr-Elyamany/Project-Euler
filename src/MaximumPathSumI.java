import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class MaximumPathSumI {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		
		int [][] grid = new int[100][101];
		BufferedReader reader = new BufferedReader(new FileReader("triangle1.txt"));
		String line = null;
		int counter = 0;
		
		while ((line = reader.readLine()) != null) {
		    String [] temp = line.split(" ");
		    for (int i = 0; i < temp.length; i++) {
				grid[counter][i] = Integer.parseInt(temp[i]);
			}
		    counter++;
		}
		counter = 1;
		for (int i = 1; i < grid.length; i++) {
			for (int j = 0; j <= counter; j++) {
				int max = 0;
				int sum1 , sum2 ,sum3 =0;
				if(j==0)
				{
					
					grid[i][j] = grid[i][j] + grid[i-1][j];
					
				}
				else
				{
					sum1 = grid[i][j] + grid[i-1][j];
					sum2 = grid[i][j] + grid[i-1][j-1];
					grid[i][j] = (sum1 > sum2) ? sum1 : sum2;
				}
			}
			counter++;
		}
		String content = "";
		for (int i = 0; i < grid.length; i++) {
			content += Arrays.toString(grid[i])+"\n";
		}
		File file = new File("filename3.txt");
		 
		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		System.out.println(getMax(grid[99]));

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();
//		System.out.println(Arrays.toString(grid[14]));
	}

	static int getMax(int[] a)
	{
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}
}
