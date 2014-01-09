import java.util.Arrays;
import java.util.Scanner;


public class StringSimilarity {

	/**
	 * @param args
	 */
	public static long sum(int [] z)
	{
		long sum = 0;
		for (int i = 0; i < z.length; i++) {
			sum += z[i];
		}
		return sum;
	}
	public static int[] z(String nn)
	{
		int L = 0, R = 0;
		int n = nn.length();
		int [] z = new int[n];
		char [] s = nn.toCharArray();
		for (int i = 1; i < n; i++) {
		  if (i > R) {
		    L = R = i;
		    while (R < n && s[R-L] == s[R]) R++;
		    z[i] = R-L; R--;
		  } else {
		    int k = i-L;
		    if (z[k] < R-i+1) z[i] = z[k];
		    else {
		      L = i;
		      while (R < n && s[R-L] == s[R]) R++;
		      z[i] = R-L; R--;
		    }
		  }
		}
		return z;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		while(t-->0)
		{
			String nn = s.next();
			long sum = nn.length();
			sum += sum(z(nn));
			
			System.out.println(sum);
			
		}
		
	}
	
	

}
