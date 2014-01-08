import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LargestProductGrid {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int [][] grid = new int[20][20];
		
		BufferedReader reader = new BufferedReader(new FileReader("grid.txt"));
		String line = null;
		int counter = 0;
		while ((line = reader.readLine()) != null) {
		    String [] temp = line.split(" ");
		    for (int i = 0; i < temp.length; i++) {
				grid[counter][i] = Integer.parseInt(temp[i]);
			}
		    counter++;
		}
		
		long max = 1;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				
				if(j>=3)
				{
					int product = grid[i][j]*grid[i][j-1]*grid[i][j-2]*grid[i][j-3];
					if(product>max)
						max = product;
				}
				if(j<=16)
				{
					int product = grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3];
					if(product>max)
						max = product;
				}
				if(i>=3)
				{
					int product = grid[i][j]*grid[i-1][j]*grid[i-2][j]*grid[i-3][j];
					if(product>max)
						max = product;
				}
				if(i<=16)
				{
					int product = grid[i][j]*grid[i+1][j]*grid[i+2][j]*grid[i+3][j];
					if(product>max)
						max = product;
				}
				if(i>=3&&j>=3)
				{
					int product = grid[i][j]*grid[i-1][j-1]*grid[i-2][j-2]*grid[i-3][j-3];
					if(product>max)
						max = product;
				}
				if(i>=3&&j<=16)
				{
					int product = grid[i][j]*grid[i-1][j+1]*grid[i-2][j+2]*grid[i-3][j+3];
					if(product>max)
						max = product;
				}
				if(i<=16&&j<=16)
				{
					int product = grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3];
					if(product>max)
						max = product;
				}
				if(i<=16&&j>=3)
				{
					int product = grid[i][j]*grid[i+1][j-1]*grid[i+2][j-2]*grid[i+3][j-3];
					if(product>max)
						max = product;
				}
				
			}
			
		}
		System.out.println(max);
	}

}
