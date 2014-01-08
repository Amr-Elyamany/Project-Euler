import java.math.BigInteger;
import java.util.ArrayList;


public class EvenFibonacci {

	static ArrayList<Long> factors = new ArrayList<>();
	
	
//	public static void primes()
	public static ArrayList<Long> getFactors(long n)
	{
		factors.clear();
		for (long  i = 1; i <= n; i++) {
			if(n%i==0)
				factors.add(i);
		}
		return factors;
	}
	public static void main(String[] args) {
		
		long n1 = 1;
		long n2 = 2;
		long fib = n1+n2;
		long sum = n2;
		int value = 4000000;
		while(fib<value)
		{
			n1 = n2;
			n2 = fib;
			fib = n1 + n2;
			if(fib>=value)
				break;
//			System.out.println(fib);
			if(fib%2==0)
				sum += fib;
		}
		
		System.out.println(sum);
	}

}
