import java.util.*;


public class validation {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {

		Stack st = new Stack();
		String test;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression");
		test = sc.next();
		for(int i=0; i< test.length(); i++) {
			switch(test.charAt(i)) {
			case '(' :
			{
				st.push(test.charAt(i));
				//System.out.println(st);
				break;
			}
			case ')':
			{
				if(st.isEmpty()) {
					count++;
					break; 
				}else
					st.pop();
				//System.out.println(st);
			}

			}
			if(count> 0) {
				break;
			}
		}
		if(count == 0 && st.size() == 0) {
			System.out.println("Valid");
		} else
			System.out.println("Not Valid");

	}
}
