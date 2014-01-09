import java.util.Scanner;


public class MaximizeStocks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s  = new Scanner(System.in);
		
		
		int t  = s.nextInt();
		while (t-->0) {
			
			int n = s.nextInt();
			long[] stocks = new long[n];
			for (int i = 0; i < stocks.length; i++) {
				stocks[i] = s.nextLong();
			}
			
			long profit = maxProfit(stocks);
			System.out.println(profit);
		}
	}

	private static long maxProfit(long[] stocks) {
		// TODO Auto-generated method stub
		long profit = 0;
		int numberOfStocks = 0;
		for (int i = 0; i < stocks.length; i++) {
			if(checkBigger(i, stocks))
			{
				profit -= stocks[i];
				numberOfStocks ++;
			}
			else
			{
				profit += numberOfStocks*stocks[i];
				numberOfStocks = 0;
			}
		}
		
		return profit;
	}
	private static boolean checkBigger(int pos,long[]stocks)
	{
		for (int i = pos+1; i < stocks.length; i++) {
			if(stocks[i]>stocks[pos])
				return true;
		}
		
		return false;
	}

}
