import java.util.Arrays;

public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ff = { 'a', 'b', 'a', 'c', 'b' };
//		int counter = 1;
//		int temp = counter;
//		for (int i = 0; i < ff.length; i++) {
//
//			for (int j = i + 1; j < ff.length; j++) {
//				 if(ff[i]!=ff[j])
//				 {
//					 ff[counter] = ff[j];
//					 counter++;
//				 }
//				 
//
//			}
//			temp++;
//			counter = temp;
//		}
//		System.out.println(Arrays.toString(ff));
//		String n = new String(ff);
//		n.replaceAll(" ", "");
//		System.out.println(n);

		removeDuplicates(ff);
	}

	public static void removeDuplicates(char[] str) {
		if (str == null)
			return;
		int len = str.length;
		if (len < 2)
			return;

		int tail = 1;

		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j])
					break;
			}
			if (j == tail) {
				str[tail] = str[i];
				++tail;
			}
		}
		str[tail] = 0;
	}

}
