
public class TenThousandPrime {

	public static boolean isPrime(long n)
	{
		for (int i = 2; i <=Math.sqrt(n); i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long number = 14;
		long counter = 6;
		while(true)
		{
			
			if (isPrime(number)) {
				counter++;
			}
			if (counter==10001) {
				break;
			}
			number++;
		}
		System.out.println(number);
	}

}
