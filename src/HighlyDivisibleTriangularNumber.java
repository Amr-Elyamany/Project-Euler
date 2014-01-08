
public class HighlyDivisibleTriangularNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long divisorCounter = 0;
		long  i = 1;
		long number = 28;
		while(true)
		{
			number = i*(i+1)/2;
			for (int j = 1; j <= Math.sqrt(number); j++) {
				if(number%j==0)
					divisorCounter+=2;
			}
			if(divisorCounter>500)
			{
				break;
			}
			i++;
			divisorCounter = 0;
			
		}
		System.out.println(number);
	}

}
