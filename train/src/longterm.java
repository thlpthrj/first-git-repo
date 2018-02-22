import java.util.Scanner;


public class longterm {

	public static void main(String args[]) {
		String num="12340";
		String ch = "abc";
		String fl = "2.36";
		int n = Integer.valueOf(num);
		char[] c = ch.toCharArray();
		float f = Float.valueOf(fl);
		System.out.println(n+" "+f);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
}
