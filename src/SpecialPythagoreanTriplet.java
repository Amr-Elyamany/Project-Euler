import java.util.HashMap;


public class SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 0;
		double b = 0;
		double c = 0;
		HashMap<Double, Double> numbers = new HashMap<>();
		for(double i = 0; i<=1000;i++)
		{
			numbers.put(i, i);
		}
		double temp = 0;
		for (double i = 1 ;i<1000;i++)
		{
			for (double j = i+1;j<=1000;j++)
			{
				a=i; 
				b=j;
				c = Math.sqrt(a*a + b*b);
				if(a+b+c ==1000)
				{
					i = 1000;
					break;
				}
			}
		}
		System.out.println(a +" "+b+" "+c);
	}

}
