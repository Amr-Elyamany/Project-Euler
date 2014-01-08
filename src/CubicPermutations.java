import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class CubicPermutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, ArrayList<Long>> map = new HashMap<String, ArrayList<Long>>();
		for (int i = 0; i <= 9000; i++) {
			String cube = (long)Math.pow(i, 3)+"";
			String sort = sort(cube);
			if(!map.containsKey(sort))
			{
				ArrayList<Long> tmp = new ArrayList<>();
				tmp.add((long)Math.pow(i, 3));
				map.put(sort, tmp);
			}
			else
			{
//				int count = map.get(sort).intValue();
//				map.remove(sort);
//				map.put(sort, count+1);
				map.get(sort).add((long)Math.pow(i, 3));
			}
			
		}
		for (Entry<String, ArrayList<Long>> entry : map.entrySet())
		{
		    if (entry.getValue().size()==5) {
				System.out.println(entry.getValue().get(0));
			}
		}
	}
	
	public static String sort(String g)
	{
		char[] aa = g.toCharArray();
		Arrays.sort(aa);
		return new String(aa);
	}

}
