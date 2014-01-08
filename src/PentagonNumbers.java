import java.util.HashMap;


public class PentagonNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> numbers = new HashMap<>();
		int [] pns = new int[10000];
		for (int i = 1; i <=10000; i++) {
			int pn = (i*(3*i-1))/2;
			numbers.put(pn, pn);
			pns[i-1] = pn;
		}
		for (int i = 0; i < pns.length; i++) {
			for (int j = i+1; j < pns.length; j++) {
				
				int sum = pns[i]+pns[j];
				int diff = Math.abs(pns[i]-pns[j]);
				if(numbers.containsKey(sum)&&numbers.containsKey(diff))
				{
					System.out.println(diff);
					break;
				}
			}
		}
		
	}

}
