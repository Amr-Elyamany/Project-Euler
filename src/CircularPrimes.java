import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class CircularPrimes {

	/**
	 * @param args
	 */
	static boolean[] primes;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		primes = sieve(1000000);
		ArrayList<Integer> prime = new ArrayList<>();
		for (int i = 0; i < primes.length; i++) {
			if(primes[i])
				prime.add(i);
		}
		int counter = 0;
		for (int i = 0; i < prime.size(); i++) {
			int[] cir = circ(prime.get(i));
			if (check(cir)) {
				counter++;
			}
		}
		System.out.println(counter);
//		int[] ff = circ(1978);
//		for (int i = 0; i < ff.length; i++) {
//			System.out.println(ff[i]);
//		}
	}

	public static boolean check(int[]num)
	{
		for (int i = 0; i < num.length; i++) {
			if(primes[num[i]]==false)
				return false;
		}
		return true;
	}
	public static int[] circ(int n)
	{
		String num = ""+n;
		int [] cir = new int[num.length()];
		cir[0] = n;
		for (int i = 1; i < num.length(); i++) {
			cir[i] = Integer.parseInt(num.substring(i,num.length())+num.substring(0,i));
		}
		return cir;
	}
	public static boolean[] sieve(int n)
	{
		boolean [] primes = new boolean[n+1];
		Arrays.fill(primes,true);
		primes[0] = false;
		primes[1] = false;
		int m=(int) Math.sqrt(n);

	   for (int i=2; i<=m; i++)
	   {
	      if (primes[i])
	      {
	         for (int k=i*i; k<=n; k+=i)
	            primes[k]=false;
	      }
	   }
	   return primes;
	}
}
