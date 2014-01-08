import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub

		int[][] grid = new int[15][15];
		BufferedReader reader = new BufferedReader(new FileReader(
				"triangle.txt"));
		String line = null;
		int counter = 0;

		while ((line = reader.readLine()) != null) {
			String[] temp = line.split(" ");
			for (int i = 0; i < temp.length; i++) {
				grid[counter][i] = Integer.parseInt(temp[i]);
			}
			counter++;
		}
		for (int i = 13; i >= 0; i--) // i Sovled this problem for 100 rows
		{
			for (int j = 0; j <= i; j++)
				grid[i][j] = grid[i][j]
						+ Math.max(grid[i + 1][j], grid[i + 1][j + 1]);
		}
		System.out.println(grid[0][0]);
	}

}
