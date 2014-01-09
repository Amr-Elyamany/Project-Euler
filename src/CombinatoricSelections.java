import java.math.BigInteger;


public class CombinatoricSelections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long [][] ncr = new long[101][101];
		int count = 0;
		for (int i = 23; i <= 100; i++) {
			for (int j = 0; j <= i; j++) {
				if(ncr(i, j).length()>=7)
					count++;
			}
		}
		System.out.println(count);
	}
	public static String ncr(int i,int j)
	{
		return fact(i).divide(fact(j).multiply(fact(i-j))).toString();
	}
	public static BigInteger fact(int i)
	{
		BigInteger bg = BigInteger.valueOf(1);
		for (int j = 2; j <=i; j++) {
			bg = bg.multiply(BigInteger.valueOf(j));
		}
		return bg;
	}

}
