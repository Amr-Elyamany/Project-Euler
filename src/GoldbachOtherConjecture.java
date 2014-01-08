
public class GoldbachOtherConjecture {

	public static boolean check(int number)
	{
		int h = (int) Math.sqrt(number);
		int prime;
		for (int i = 0; i <= h; i++) {
			prime = number - 2*(i*i);
			if(prime>0 && isPrime(prime))
				return true;
		}
		return false;
	}
	
	public static boolean isPrime(int n)
	{
		for (int i = 2; i <=Math.sqrt(n); i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 5;
		while(true)
		{
			if (check(number)==false) {
				break;
			}
			number +=2;
		}
		System.out.println(number);
	}

}
