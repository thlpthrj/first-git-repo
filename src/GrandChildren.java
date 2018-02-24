import java.util.Scanner;

import com.sun.xml.internal.ws.util.StringUtils;


public class GrandChildren {

	public static void main(String[] args){
		String[][] arr={{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String child = "";
		int noOfGrandChild=0;
		int i=0;
		for(i=0;i<arr.length;i++){
			if(arr[i][1].equalsIgnoreCase(str)){
				child=arr[i][0];
			}
		}
		for(i=0;i<arr.length;i++){
			if(child.equals(arr[i][1])){
				noOfGrandChild++;
			}
		}
		
		System.out.println(noOfGrandChild);
	}
}
