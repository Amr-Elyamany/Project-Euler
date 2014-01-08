
public class LexicographicPermutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int target = 1000000-1;
		StringBuilder s = new StringBuilder("0123456789");
		String perm ="";
		
//		int fact = fact(s.length()-1);
//		int pos = target/fact;
//		perm += s.charAt(pos);
//		s.deleteCharAt(pos);
//		target = target-pos*fact;
		while(s.length()>0)
		{
			int fact = fact(s.length()-1);
			int pos = target/fact;
			perm += s.charAt(pos);
			s.deleteCharAt(pos);
			target = target-pos*fact;
			
		}
		System.out.println(perm);
	}
	
	public static int fact(int n)
	{
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

}
