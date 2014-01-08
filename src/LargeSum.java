import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;


public class LargeSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BigInteger sum = BigInteger.ZERO;
		BigInteger temp =null;
		
//		System.out.println(f.add(g).toString());
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
	    try {
	        
	        String line = br.readLine();
	 
	        while (line != null) {
	        	System.out.println(line);
	        	temp = new BigInteger(line);
		        sum = sum.add(temp);
	            line = br.readLine();
	        }
	        
	    } finally {
	        br.close();
	    }
	    System.out.println(sum.toString());
	}

}
