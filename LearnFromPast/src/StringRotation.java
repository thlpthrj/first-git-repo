import java.util.Scanner;


public class StringRotation {

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
				boolean x = (str1.length()==str2.length())&&((str1+str1).contains(str2));
				System.out.println(x);
		
	}
}
