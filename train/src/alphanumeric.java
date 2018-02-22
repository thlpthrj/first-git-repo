import java.util.Scanner;


public class alphanumeric {
	//private static char q;

	public static void main(String args[]) {
		//String al;
		//System.out.println(al);
		//System.out.println(d);
		Scanner sc = new Scanner(System.in);
		int number,count,quo,rem;
		char q;
		//System.out.println((char)y);
		number = sc.nextInt();
		if(number<=26 ) {
			count=96;
			for(int i=1; i<=number;i++) {
				count++;	
			} 
			System.out.println((char)count);
		}
		if(number >26) {
			quo = number/26;
			rem = number%26;
			count = 96;
			for(int i=1; i<=rem;i++){
				count++;
			}
			if(rem == 0) {
				count= count+26;
				quo=quo-1;
			}
		//	System.out.println("\n");
			for(int i=1;i<=quo+1;i++) {
				System.out.print((char)count);
			}
			//q = (char) count;
			//System.out.println(count);
		}
	}
}
