import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;


public class ReciprocalCycles {

	/**
	 * @param args
	 */
	public static boolean isPrime(int number)
	{
		for (int i = 2; i <=Math.sqrt(number); i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int max = 7;
		for (int i = 8; i <1000; i++) {
			
			int p = i;
			if(isPrime(p))
			{
				int t = 0;
				int r = 1;
				int n = 0;
				int b = 10;
				
				do
				{
					t = t+1;
					int x = r*b;
					int d = x/p;
					r = x%p;
					n = n*b+d;
//					System.out.println(d);
				}while(r!=1);
				
				if(t == p-1)
				{
					if(t>max)
						max = p;
				}
			}
		}
		System.out.println(max);
		
	}

}
