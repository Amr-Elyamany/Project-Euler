
public class DoubleBasePalindromes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 0; i <= 1000000; i++) {
			String number = i+"";
			String bin = Integer.toBinaryString(i);
			if(check(number)&&check(bin))
				sum += i;
		}
		
		System.out.println(sum);
	}
	public static boolean check(String n)
	{
		for (int i = 0; i < n.length(); i++) {
			if(n.charAt(i)!=n.charAt(n.length()-1-i))
				return false;
		}
		return true;
	}

}
