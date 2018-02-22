import java.util.Scanner;


public class matrixrot {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int row,col;
		int arr[][] = new int[3][3];
		int rarr[][] = new int[3][3];

		for(row=0; row<3; row++) {
			for(col=0;col<3;col++) {
				arr[row][col] = sc.nextInt();
			}
		}

		for(row=0; row<3; row++) {
			for(col=0; col<3; col++)
				rarr[row][col++]= arr[row][col];
		}

		for(row=0; row<3; row++) {
			System.out.println("\n");
			for(col=0;col<3;col++) {
				System.out.print(rarr[row][col]+" ");
			}
		}





	}
}
