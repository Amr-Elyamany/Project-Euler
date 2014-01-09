import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Median {

	/**
	 * @param args
	 */
	private static PriorityQueue<Long> maxHeap, minHeap;  
    private static int numOfElements = 0;  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparator<Long> revCmp = new Comparator<Long>() {  
            @Override  
            public int compare(Long left, Long right) {  
                return right.compareTo(left);  
            }  
        };  
  
        Scanner s = new Scanner(System.in);
        // Or you can use Collections' reverseOrder method as follows.  
        // Comparator<Integer> revCmp = Collections.reverseOrder();  
  
        maxHeap = new PriorityQueue<Long>(20, revCmp);  
        minHeap = new PriorityQueue<Long>(20);  
  
        int t = s.nextInt();
        DecimalFormat df = new DecimalFormat("#.#");
		
        for (int i = 0; i < t; i++) {
			String op = s.next();
			long number = s.nextLong();
			if(op.equals("r"))
			{
				int code = delete(number);
				if(code == -1)
					System.out.println("Wrong!");
				else
				{
					double median = getMedian();
					if(median!=0)
						System.out.println(df.format(median));
					else
						System.out.println("Wrong!");
				}
			}
			else 
			{
				addNumber(number);
				System.out.println(df.format(getMedian()));
			}
			
		}
        
	}
	public static void addNumber(long value) {  
        maxHeap.add(value);  
        // If total number of elements in the heap is even before insertion,  
        // then there are N elements both in max-heap and min-heap.  
        // Insert to max-heap, result in max-heap has n+1 elements, but this is  
        // valid since max-heap can contain 1 more element than min-heap  
        if (numOfElements%2 == 0) {  
              
            if (minHeap.isEmpty()) {  
                numOfElements++;  
                return;  
            }  
            // If the newly inserted value is larger than root of min-heap  
            // we need to pop the root of min-heap and insert it to max-heap.  
            // And pop root of max-heap and insert it to min-heap  
            else if (maxHeap.peek() > minHeap.peek()) {  
                Long maxHeapRoot = maxHeap.poll();  
                Long minHeapRoot = minHeap.poll();  
                maxHeap.add(minHeapRoot);  
                minHeap.add(maxHeapRoot);  
            }   
        }   
        // For this case, before insertion, max-heap has n+1 and min-heap has n elements.  
        // After insertion, max-heap has n+2 and min-heap has n elements, so violate!  
        // And we need to pop 1 element from max-heap and push it to min-heap  
        else {  
            minHeap.add(maxHeap.poll());  
        }  
        numOfElements++;  
    }  
  
	public static int delete(long value)
	{
		
		if(maxHeap.contains(value))
		{
			numOfElements--;
			maxHeap.remove(value);
		}
		else if(minHeap.contains(value))
		{
			numOfElements--;
			minHeap.remove(value);
		}
		else
			return -1;
		
		if(maxHeap.size()-minHeap.size()>1)
		{
			minHeap.add(maxHeap.poll());
		}
		else if(minHeap.size()-maxHeap.size()>1)
		{
			maxHeap.add(minHeap.poll());
		}
		return 1;
	}
    /* 
     * If maxHeap and minHeap are of different sizes, then maxHeap must have one 
     * extra element. 
     */  
    public static double getMedian() {  
        if (numOfElements%2 != 0)       // If total number received is not even  
            return new Double(maxHeap.peek());  
        else  
        {
        	long min = 0 , max = 0;
        	if(!maxHeap.isEmpty())
        		max = maxHeap.peek();
        	if(!minHeap.isEmpty())
        		min = minHeap.peek();
            return (min + max) / 2.0;
        }
    }  

}
