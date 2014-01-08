import java.math.BigInteger;


public class PowerDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger a = BigInteger.valueOf(2);
		a = a.pow(1000);
		String number = a.toString();
		long sum = 0;
		for (int i = 0; i < number.length(); i++) {
			sum += Integer.parseInt(number.charAt(i)+"");
		}
		System.out.println(sum);
	}

}
