//import java.awt.ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class NonAbundantSums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// IntegerODO Auto-generated method stub

		Collection<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		ArrayList< ArrayList<Integer> > ps = powerset(numbers);
		
//		for (int i = 0; i < ps.size(); i++) {
//			for (int j = 0; j < ps.get(i).size(); j++) {
//				System.out.print(ps.get(i).get(j)+" ");
//			}
//			System.out.println();
//		}
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int j2 = 0; j2 < ps.size(); j2++) {
					for (int k = 0; k < ps.get(j2).size(); k++) {
						String num = i+"";
					}
				}
			}
		}
		
	}
	 
	public static  ArrayList< ArrayList<Integer> > powerset(Collection<Integer> list) {
	  ArrayList<ArrayList<Integer>> ps = new ArrayList<ArrayList<Integer>>();
	  ps.add(new ArrayList<Integer>());   // add the empty set
	 
	  // for every item in the original list
	  for (Integer item : list) {
	    ArrayList<ArrayList<Integer>> newPs = new ArrayList<ArrayList<Integer>>();
	 
	    for (ArrayList<Integer> subset : ps) {
	      // copy all of the current powerset's subsets
	      newPs.add(subset);
	 
	      // plus the subsets appended with the current item
	      ArrayList<Integer> newSubset = new ArrayList<Integer>(subset);
	      newSubset.add(item);
	      newPs.add(newSubset);
	    }
	 
	    // powerset is now powerset of list.subArrayList(0, list.indexOf(item)+1)
	    ps = newPs;
	  }
	  return ps;
	}

}
