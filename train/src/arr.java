import java.util.Scanner;


public class arr {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int i,j,son,gson;
		String test,get;
		String arr[][] = new String[4][2];
		son=0;
		get = null;
		gson=0;
		for( i=0; i<4; i++) {
			for(j=0; j<2; j++) {
				arr[i][j] = sc.next();
			}
		}

		for( i=0; i<4; i++) {
			for(j=0; j<2; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.print("\n");
		}

		System.out.println("Enter the Name \n");
		test = sc.next();

		for(i=0; i<4;i++) {
			if(test.equals(arr[i][1]))
			{
				System.out.println("$@#$");
				get = arr[i][0];
				System.out.println(get);
				son++;
			}
		}
		for(i=0; i<4; i++) {
			if(arr[i][1].equals(get))
			{
				gson++;
			}
		}
		System.out.println("Grand Son ans Son are "+gson+","+son);


	}
}
