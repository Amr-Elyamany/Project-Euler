
public class LargestPalindromeProduct {

	/**
	 * @param args
	 */
	public static String reverse(String number)
	{
		String temp = "";
		for (int i = number.length()-1; i >= 0;i--) {
			temp+=number.charAt(i);
		}
		return temp;
	}
	
	public static boolean isPalindrome(long number)
	{
		String temp =""+number;
		String h = reverse(temp);
		
		if(temp.equalsIgnoreCase(h))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long max = 0;
		for (int i = 100; i < 999; i++) {
			for (int j = i+1; j <= 999; j++) {
				long multiply = i*j;
				if(isPalindrome(multiply)&&(multiply)>max)
					max = multiply;
			}
		}
		StringBuilder a = new StringBuilder("7amo");
		long number = 66667;
		System.out.println(max);
	}

}
