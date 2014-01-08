import java.util.HashMap;


public class PandigitalProducts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long sum = 0;
		HashMap<Integer, Integer> products = new HashMap<>();
		for (int i = 0; i < 3000; i++) {
			for (int j = 0; j < 100; j++) {
				boolean jj = check(i, j, i*j);
				if((!products.containsKey(i*j))&&jj)
				{
					System.out.println(i+""+j+""+i*j);
					sum += i*j;
					products.put(i*j, i*j);
				}
				
			}
		}
		System.out.println(sum);
	}
	//45228
	public static boolean check(int i , int j , long x)
	{
		String temp = i+""+j+""+x;
		if(temp.length()<9)
			return false;
		else
		{
			HashMap<Character, Character> map = new HashMap<>();
			
			for (int k = 0; k < temp.length(); k++) {
				
				if(map.containsKey(temp.charAt(k))||temp.charAt(k)=='0')
				{
					return false;
				}
				else
					map.put(temp.charAt(k), temp.charAt(k));
			}
		}
		return true;
	}

}
