
public class DigitFactorials {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] fact = {1,1,2,6,24,120,720,5040,40320,362880};
		long sumOfNum = 0;
		for (int i = 11; i <= 99999999; i++) {
			String temp = i+"";
			long sum = 0;
			for (int j = 0; j < temp.length(); j++) {
				sum += fact[Integer.parseInt(temp.charAt(j)+"")];
			}
			if(sum==i)
				sumOfNum += i;
			sum = 0;
		}
		System.out.println(sumOfNum);
	}

}
