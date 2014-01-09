
public class SubstringDivisibility {

	/**
	 * @param args
	 */
	public static long counter = 0;
	public static void permutation(String prefix, String str)
	{
		int n = str.length();
		if (n == 0) 
		{
			int n1 = Integer.parseInt(prefix.substring(1,4));
			int n2 = Integer.parseInt(prefix.substring(2,5));
			int n3 = Integer.parseInt(prefix.substring(3,6));
			int n4 = Integer.parseInt(prefix.substring(4,7));
			int n5 = Integer.parseInt(prefix.substring(5,8));
			int n6 = Integer.parseInt(prefix.substring(6,9));
			int n7 = Integer.parseInt(prefix.substring(7,10));
			if(n1%2==0&&n2%3==0&&n3%5==0&&n4%7==0&&n5%11==0&&n6%13==0&&n7%17==0)
			{
				counter += Long.parseLong(prefix);
			}
		}
		
		for (int i = 0; i < n; i++) {
			
			permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("", "0123456789");
		System.out.println(counter);
		
		
		
	}

}
