import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class PrimePermutations {

	/**
	 * @param args
	 */
	
	public static boolean isPrime(int n) {
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 1000; i < 10000; i++) {
			if(isPrime(i))
				primes.add(i);
		}
		System.out.println(primes.size());
		for (int i = 0; i < primes.size(); i++) {
			for (int j = i+1; j < primes.size(); j++) {
				for (int j2 = j+1; j2 < primes.size(); j2++) {
					
					char[] a = (primes.get(i)+"").toCharArray();
					char[] b = (primes.get(j)+"").toCharArray();
					char[] c = (primes.get(j2)+"").toCharArray();
					Arrays.sort(a);
					Arrays.sort(b);
					Arrays.sort(c);
					
					
					if(primes.get(j2)-primes.get(j)==primes.get(j)-primes.get(i)&&
							Arrays.equals(a, b)&&Arrays.equals(c, b)&&Arrays.equals(a, c))
					{
						System.out.println(primes.get(i)+" "+primes.get(j)+" "+primes.get(j2));
					}
						
//						System.out.println("horaaaaaaaaay");
				}
			}
		}
		
	}

}
