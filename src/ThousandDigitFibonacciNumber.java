import java.math.BigInteger;


public class ThousandDigitFibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger n1 = BigInteger.ONE;
		BigInteger n2 = BigInteger.valueOf(2);
		BigInteger fib = n1.add(n2);
//		long sum = n2;
		int value = 4000000;
		BigInteger f = BigInteger.valueOf(3);
		
		while(true)
		{
			n1 = n2;
			n2 = fib;
			fib = n1.add(n2);
			f = f.add(BigInteger.ONE);
			if(fib.toString().length()==1000)
				break;
			
//			String h = fib+"";
			
//			System.out.println(fib);
			
		}
		System.out.println(f.toString());
	}

}
