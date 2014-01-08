
public class SmallestMultiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter = 0;
		int number = 2521;
		while(true)
		{
			for (int i = 1; i <= 20; i++) {
				if(number%i==0)
					counter++;
			}
			if (counter==20) {
				break;
			}
			number++;
			counter = 0;
		}
		System.out.println(number);
	}

}
