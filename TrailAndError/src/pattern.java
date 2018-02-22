
public class pattern {
	public static void main(String args[]) {

		int[][] arr = new int[5][5];
		int row,col,val=4;
		int len =5;
		System.out.println(arr.length);
		for(row=0; row<len;row++) {
			for(col=row;col<len-row;col++) {
				arr[row][col] = val;
			}
			val--;
		}
	/*	val =4;
		for(row=0; row<len;row++) {
			for(col=row;col<len-row;col++) {
				arr[col][row] = val;
			}
			val--;
		} 
		val =4;
		for(row=len-1; row>=0;row--) {
			for(col=row; col>=len-row;col--) {
				arr[row][col] = val;
			}
			val--;
		}
		val =4;
		for(row=len-1; row>=0;row--) {
			for(col=row; col>=len-row;col--) {
				arr[col][row] = val;
			}
			val--;
		} */

		for(row=0;row<len;row++) {
			System.out.println("\n");
			for(col=0;col<len; col++) {
				System.out.print(arr[row][col]+" ");
			}

		} 
	}
}
