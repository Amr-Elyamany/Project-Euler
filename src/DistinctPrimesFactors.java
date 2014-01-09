import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class DistinctPrimesFactors {

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
	public static int[] genertePrimes(int n)
	{
		int [] primes = new int[n];
		
		int counter = 0;
		int i = 2;
		while(counter<n)
		{
			if(isPrime(i))
			{
				primes[counter] = i;
				counter++;
				
			}
			i++;
		}
		return primes;
	}
	
	public  static ArrayList<Integer> primeFact(int n , int []primes)
	{
		ArrayList<Integer> con = new ArrayList<Integer>();
		
		while(n!=1)
		{
			for (int i = 0; i < primes.length; i++) {
				int temp = primes[i];
				if(n%temp==0)
				{
					n = n/temp;
					if(!con.contains(temp))
						con.add(temp);
					break;
				}
			}
		}
//		Collections.disjoint(con, con);
		return con;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] primes = genertePrimes(100000);
		
		for (int i = 1000; i < 1000000; i++) {
			
			ArrayList<Integer> first = primeFact(i, primes);
			
			if(first.size()==4)
			{
				ArrayList<Integer> second = primeFact(i-1, primes);
				if(second.size()==4)
				{
					ArrayList<Integer> third = primeFact(i-2, primes);
					if(third.size()==4)
					{
						ArrayList<Integer> fourth = primeFact(i-3, primes);
						if(fourth.size()==4)
						{
							System.out.println(i);
							break;
							
						}
					}
					
					
				}
			}
			
		}
//		
		ArrayList<Integer> vv = primeFact(134043, primes);
		
		ArrayList<Integer> zz = primeFact(134044, primes);
//		
		ArrayList<Integer> xx = primeFact(134045, primes);
		
		ArrayList<Integer> yy = primeFact(134046, primes);
		
		int x =2;
		x = 3;
		System.out.println(x);
//		System.out.println(Collections.disjoint(vv, zz));
	}

}
