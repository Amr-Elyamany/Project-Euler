import java.math.BigInteger;


public class LargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger fac = BigInteger.valueOf(100);
//		for (int i = 500; i >=2 ; i--) {
//			fac = fac.multiply(BigInteger.valueOf(i));
//		}
		fac = fac.pow(100);
		System.out.println(fac.toString());
	}

}
