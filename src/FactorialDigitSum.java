import java.math.BigInteger;


public class FactorialDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger big  = BigInteger.valueOf(100);
		for (int i = 1; i <= 100; i++) {
			big = big.multiply(BigInteger.valueOf(i));
		}
		String number  = big.toString();
		long sum = 0;
		for (int i = 0; i < number.length(); i++) {
			sum+=Integer.parseInt(number.charAt(i)+"");
		}
		System.out.println(sum);
	}

}
