
public class PrimePermutations {

	/**
	 * @param args
	 */
	public static boolean isPrime(int number)
	{
		for (int i = 2; i <=Math.sqrt(number); i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] first ={2357,2375,2573,2537,2753,2735};
		int [] second ={3257,3275,3752,3725,3527,3572};
		int [] third ={5327,5372,5723,5732,5273,5237};
		int [] fourth ={7532,7523,7325,7352,7235,7253};
		
		
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < second.length; j++) {
				for (int j2 = 0; j2 < third.length; j2++) {
					if(fourth[j2]-second[j]==second[j]-first[i])
						System.out.println("horaaaay");
				}
			}
		}
	}

}
