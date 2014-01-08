
public class SumSquareDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number  = 10;
		long diff = 0;
		for (int i = 1; i < 100; i++) {
			for (int j = i+1; j <= 100; j++) {
				diff+=2*i*j;
			}
		}
		System.out.println(diff);
	}

}
