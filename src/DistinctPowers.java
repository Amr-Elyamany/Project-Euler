import java.math.BigInteger;
import java.util.HashMap;


public class DistinctPowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minA = 2;
		int maxA = 100;
		int minB = 2;
		int maxB = 100;
		BigInteger f = BigInteger.ONE;
		HashMap<String, String> numbers = new HashMap<>();
		for (int i = minA; i <= maxA; i++) {
			for (int j = minB; j <= maxB; j++) {
				f = BigInteger.valueOf(i);
				String temp = f.pow(j).toString();
				if(!numbers.containsKey(temp))
				{
					numbers.put(temp, temp);
				}
				
			}
		}
		
		
//		long temp = (long) Math.pow(100, 100);
		System.out.println(numbers.size());
	}

}
