
public class DigitFifthPowers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		long sum = 0;
		long sumOfNum = 0;
		for (int i = 10; i <= 531441; i++) {
			String temp  = i+"";
			for (int j = 0; j < temp.length(); j++) {
				sum += Math.pow(Integer.parseInt(temp.charAt(j)+""), 5);
			}
			if(sum==i)
			{
				counter++;
				sumOfNum += i;
			}
			sum = 0;
		}
		System.out.println(sumOfNum);
		//443839
	}

}
