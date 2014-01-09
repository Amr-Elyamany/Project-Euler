
public class DiophantineEquation {

	private static int maxD;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long max = 0;
		for (int d = 1; d <= 1000; d++) {
			long i = 1;
			long  j = 1;
			
			if(Math.ceil(Math.sqrt(d))!=Math.floor(Math.sqrt(d)))
			{
				for (i = (long)Math.sqrt(d);i*i-d*j*j!=1&&i<=100000 ; i++) {
					//||i*i-d*j*j!=1
					for (j = 1; j<=(long)Math.sqrt((i*i-1)/d); j++) {
						
					}
					
				}
				
			}
			
			if(i!=100001)
			{
//				System.out.println(d+" "+i+" "+j);
				if(i>max)
				{
					max = i;
					maxD = d;
				}
			}
			
		}
		System.out.println(maxD);
	}

}
