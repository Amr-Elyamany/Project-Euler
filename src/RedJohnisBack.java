import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class RedJohnisBack {

	/**
	 * @param args
	 */
	private static BigInteger fact(int n)
	{
		BigInteger fact = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(fact(40).toString());
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-->0) {
			
			int n = s.nextInt();
			BigInteger M = BigInteger.valueOf(1);
			int temp = n/4;
			for (int i = 1; i <= temp; i++) {
				
				M = M.add(fact((n-4*i)+i).divide(fact(i).multiply(fact(n-4*i)))); 
			}
			System.out.println(sieve(Integer.parseInt(M.toString())));
		}
//		System.out.println(sieve(100));
	}
	public static int sieve(int n)
	{
	   boolean[] prime=new boolean[n+1];
	   Arrays.fill(prime,true);
	   prime[0]=false;
	   prime[1]=false;
	   int num = n;
	   int not = 2;
	   int m=(int) Math.sqrt(n);

	   for (int i=2; i<=m; i++)
	      if (prime[i])
	      {
//	    	  num++;
	         for (int k=i*i; k<=n; k+=i)
	         {
	            if(prime[k]==true)
	            	num--;
	        	 prime[k]=false;
	            
	         }
	      }
	   return num-1;
	} 

}
