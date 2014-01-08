
public class TriangularPentagonalAndHexagonal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n = 286;
		long Tn = 0;
		double nP1 = 0;
		double nP2 = 0;
		double nH1 = 0;
		double nH2 = 0;
		while(true)
		{
			Tn = ((n)*(n+1))/2;
//			System.out.println(Tn);
			nP1 = (1+ Math.sqrt((1+4*3*2*Tn)))/(2*3);
//			nP1 = -1- Math.sqrt((1+4*3*Tn)/(2*3));
			
			nH1 = (1+ Math.sqrt((1+4*2*Tn)))/(2*3);
			if(nP1%1 ==0.0 && nH1%1==0.0)
				break;
			
			n++;
		}
		double nnn = 2.0;
		System.out.println(Tn);
		System.out.println(nnn%1);
	}

}
