import java.math.BigInteger;
import java.text.DecimalFormat;


public class PowerfulDigitCounts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = 1.5;
//		DecimalFormat df = new DecimalFormat("#.#");
//		System.out.println(df.format(number));
		System.out.println(Integer.MAX_VALUE);
		int count = 1;
		for (int i = 2; i <10; i++) {
			for (int j = 1; j <=30; j++) {
				BigInteger temp = BigInteger.valueOf(i).pow(j);
				if(temp.toString().length()==j)
				{
//					System.out.println(temp +" "+ i+" "+j);
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println(BigInteger.valueOf(9).pow(23).toString().length());
	}

}
