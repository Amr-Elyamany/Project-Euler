import java.math.BigInteger;
import java.util.ArrayList;


public class LargestPrimeFactor {

	public static boolean isPrime(int n)
	{
		for (int i = 2; i <=Math.sqrt(n); i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static ArrayList<Integer> generatePrime(long number)
	{
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if(isPrime(i))
				primes.add(i);
		}
		return primes;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long number = 600851475143l;
		ArrayList<Integer> primes = generatePrime(number);
		System.out.println(primes.size());
		ArrayList<Integer> temp  = new  ArrayList<>();
		int prime = 0;
		while(number>1)
		{
			for (int i = 0; i < primes.size(); i++) {
				if(number%primes.get(i)==0)
				{
					prime = primes.get(i);
					temp.add(prime);
					break;
				}
			}
			number = number/prime;
			
		}
		System.out.println(temp.get(temp.size()-1));
	}

}
