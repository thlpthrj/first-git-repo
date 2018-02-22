import java.util.*;


public class module {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int test[] = new int[9];
		int arr[][] = new int[3][3];
		int p=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr[i][j]=sc.nextInt();
				test[p]= arr[i][j];
				p++;
			}
		}
		for(int i=0;i<9;i++) {
			System.out.println("#"+test[i]);
			for(int j=0;j<9;j++){
				if(i != j ) {
					if(test[i]==test[j]){
						System.out.println("$");
						}
				}
					
			}
			
		}
		System.out.println(p);


	}
}
