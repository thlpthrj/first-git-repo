import java.util.Scanner;


public class roughwork {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String poor,check;
		StringBuffer test = null;
		System.out.println("Enter the time in hh:mm:ss,AM/PM");
		poor = sc.next();
		for(int i=0;i<poor.length();i++) {
			if(poor.charAt(i) != ':' && poor.charAt(i) != ',') {
				test.append(poor.charAt(i));
			} else if(poor.charAt(i) == ';'){
				check = test.toString();
				 
				//i++;
			}
		}

	}
}
