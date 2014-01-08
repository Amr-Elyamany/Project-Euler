
public class DigitCancelingFractions {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 10; i < 50; i++) {
			for (int j = i+1; j <= 99; j++) {
				StringBuilder num = new StringBuilder(i+"");
				StringBuilder deno = new StringBuilder(j+"");
				double frac = (double)i/(double)j;
				double frac2 = 0;
				int t = num.indexOf(deno.charAt(0)+"");
				if(t!=-1)
				{
					deno.deleteCharAt(0);
					num.deleteCharAt(t);
				}
				else if(num.indexOf(deno.charAt(1)+"")!=-1)
				{
					t = num.indexOf(deno.charAt(1)+"");
					deno.deleteCharAt(1);
					num.deleteCharAt(t);
				}
				if(!num.toString().equals("0")&&!deno.toString().equals("0")
						&&num.toString().length()==1&&deno.toString().length()==1)
					frac2 = (double)(Integer.parseInt(num.toString()))/(double)(Integer.parseInt(deno.toString()));
				if(frac==frac2)
				{
					System.out.println(i+" "+j);
				}
//				System.out.println(num.toString());
//				System.out.println(deno.toString());
				
			}
		}
	}

}
