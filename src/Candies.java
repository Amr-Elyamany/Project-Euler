import java.util.Arrays;
import java.util.Scanner;


public class Candies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner s = new Scanner(System.in);
//		
//		int n = s.nextInt();
		int [] children ={5,6,3,4,4,3,2,1,5,4,3,6}; 
		int [] candies = new int[12];
//				new int[n];
//		for (int i = 0; i < children.length; i++) {
//			children[i] = s.nextInt();
//		}
		int minPos = getMinPos(children);
		candies[minPos] = 1;
		System.out.println(minPos);
		long candy = 0;
		int counter = 1;
		for (int i = minPos; i < children.length-1; i++) {
			if(children[i+1]>children[i])
			{
				candies[i+1] = candies[i]+1;
			}
			
			else if(children[i+1]<children[i])
			{
				int temp = children[i+2];
//				if(children[i+1]>temp)
					
			}
		}
		
		for (int i = minPos; i >=0; i--) {
			
		}
		System.out.println(candies);
	}
	private static int getMinPos(int[] children)
	{
		int pos = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < children.length; i++) {
			if(children[i]<min)
			{
				min = children[i];
				pos = i;
			}
		}
		return pos;
	}

}
