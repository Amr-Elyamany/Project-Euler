import java.util.Arrays;


public class ConsecutivePrimeSum {

	/**
	 * @param args
	 */
	
	public static boolean[] sieve(int n)
	{
	   boolean[] prime=new boolean[n+1];
	   Arrays.fill(prime,true);
	   prime[0]=false;
	   prime[1]=false;
	   int m=(int) Math.sqrt(n);

	   for (int i=2; i<=m; i++)
	      if (prime[i])
	         for (int k=i*i; k<=n; k+=i)
	            prime[k]=false;

	   return prime;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] primes = sieve(1000000);
//		for (int i = 0; i < primes.length; i++) {
//			if(primes[i])
//			{
//				int length = calculatePath(i,primes);
//			}
//		}
		System.out.println(calculatePath(953, primes));
	}
	private static int calculatePath(int n , boolean[]primes) {
		// TODO Auto-generated method stub
		int i = 0;
		int length = 0;
		int k = 2;
		while(n!=0)
		{
			if(n<0)
			{
				n += k;
				k++;
			}
			if(primes[i])
			{
				n = n-i;
				length++;
			}
			i++;
		}
		if(n == 0)
			return length;
		else
			return -1;
	}

}
