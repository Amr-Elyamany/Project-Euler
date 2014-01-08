
public class SummationOfPrimes {

	public static boolean isPrime(long number)
	{
		for (int i = 2; i <=Math.sqrt(number); i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 5;
		long number = 5;
		while(number<2000000)
		{
			if (isPrime(number)) {
				sum+=number;
			}
			number++;
		}
		System.out.println(sum);
	}

}
