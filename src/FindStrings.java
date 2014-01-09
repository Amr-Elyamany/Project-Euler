import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class FindStrings {

	/**
	 * @param args
	 */
	
	public static HashSet<String> generateAll(String[] words)
	{
		HashSet<String> result = new HashSet<String>();
		
		
		
		for (int i = 0; i < words.length; i++) {
			int size = words[i].length();
			for (int j = 0; j < size; j++) {
				
				for (int j2 = j+1; j2 <= size; j2++) {
					String temp = words[i].substring(j, j2);
					if(!result.contains(temp))
						result.add(words[i].substring(j, j2));
//					System.out.println(word.substring(i, j));
				}
			}
		}
		
		
		
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		
		int n = s.nextInt();
		String[] words = new String[n];
		for (int i = 0; i < n; i++) {
			words[i] = s.next();
		}
		
		HashSet<String> intersection = generateAll(words);
		Object[] subs = intersection.toArray();
		Arrays.sort(subs);
		
		int q = s.nextInt();
		
		for (int i = 0; i < q; i++) {
			int query = s.nextInt();
			if(query<=subs.length)
			{
				System.out.println(subs[query-1]);
			}
			else
			{
				System.out.println("INVALID");
			}
		}
		
	}
		
	

}
