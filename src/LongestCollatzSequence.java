import java.util.HashMap;


public class LongestCollatzSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Long, Long> numbers = new HashMap<>();
		long number = 1;
		long cycle = 0;
		long maxCycle = 0;
		long storedCycle = 0;
		long maxNumber = 0;
		while(number<1000000)
		{
			long temp = number;
			while(temp>1)
			{
				if(temp%2==0)
					temp = temp/2;
				else
					temp = 3*temp +1;
				cycle++;
				if(numbers.containsKey(temp))
				{
					cycle += numbers.get(temp).longValue();
					break;
				}
				
			}
			cycle+=1;
			if(maxCycle<cycle)
			{
				maxNumber = number;
				maxCycle = cycle;
			}
			numbers.put(number, cycle);
			number++;
			cycle = 0;
		}
		System.out.println(maxNumber);
	}

}
