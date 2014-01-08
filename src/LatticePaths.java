import java.math.BigInteger;

public class LatticePaths {

	public static BigInteger fact(int n) {
		
		BigInteger b = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			b = b.multiply(BigInteger.valueOf(i));
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger b = BigInteger.ONE;
		b = (fact(2*20).divide((fact(20).multiply(fact(20)))));
		System.out.println(b.toString());
	}

}
