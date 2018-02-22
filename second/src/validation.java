import java.util.Scanner;


public class validation {
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int operand=0, operator=0, brac=0;
		for(int i=0; i< input.length(); i++) {
			if(input.charAt(i) >='a' && input.charAt(i) <='z') {
				operand++;
			} else if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/' || input.charAt(i) == '%') 
				operator++;
			else if(input.charAt(i) == '(')
				brac++;
			else if(input.charAt(i) == ')')
				brac--;
		}
		System.out.println("@@@@"+operand+"**** "+operator+"&&&& ");
		if(operand == operator*2 && brac == 0) 
			System.out.println("VALID");
		else
			System.out.println("INVALID****");
	}
}
