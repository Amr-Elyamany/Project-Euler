import java.util.HashMap;


public class AmicableNumbers {

	/**
	 * @param args
	 */
	public static long sumOfFactors(long sum1)
	{
		long sum = 1;
		for (int i = 2; i <=Math.sqrt(sum1); i++) {
			if(sum1%i==0)
				sum+=(i+sum1/i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 220;
		HashMap<Long, Long> numbers = new HashMap<>();
		System.out.println(sumOfFactors(x));
		long sum1 = 0;
		long sum2 = 0;
		long sum = 0;
		for (long i = 1; i < 10000; i++) {
//			if(numbers.containsKey(i))
//			{
//				sum1 = numbers.get(i);
//						
//			}
//			else
//			{
//				sum1 = sumOfFactors(i);
//				numbers.put(i, sum1);
//			}
//			
//			if (numbers.containsKey(sum1)) {
//				sum2 = numbers.get(sum1);
//			}
//			else
//			{
//				sum2 = sumOfFactors(sum1);
//				numbers.put(sum1, sum2);
//			}
			sum1 = sumOfFactors(i);
			sum2 = sumOfFactors(sum1);
			
			if(i==sum2&i!=sum1)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}

}
