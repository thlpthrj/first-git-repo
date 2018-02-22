import java.util.Scanner;


public class sudu {

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[9][9];
		int test[] = new int[9];
		int i,j,k,l, sum;
		l=0;
		sum = 0;
		for(i=0; i<9; i++) {
			for(j=0; j<9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		//ROW CHECKER
		for(i=0;i<9;i++) {
			for(j=0; j<9; j++) {
				test[j]= arr[i][j];
			}
			for(k=0;k<9;k++){
				for(l=0;l<9;l++){
					if(k != l){
						if( test[k] == test[l] ) {
							sum++;
						}
					}
				}
			}
		}
		//Column CHEcker
		for(i=0;i<9;i++) {
			for(j=0; j<9; j++) {
				test[j]= arr[j][i];
			}
			for(k=0;k<9;k++){
				for(l=0;l<9;l++){
					if(k != l){
						if( test[k] == test[l] ) {
							sum++;
						}
					}
				}
			}
		}
		// Sub ArrAy 1,1
		l=0;
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				test[l] = arr[i][j];
				l++;
			}
		}
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(i != j)
					if(test[i] == test[j]){
						sum++;
					}
			}
		}

		// Sub ArrAy 1,2
		l = 0;
		for(i=0; i<3; i++) {
			for(j=3; j<6; j++) {
				test[l] = arr[i][j];
				l++;
			}
		}
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(i != j)
					if(test[i] == test[j]){
						sum++;
					}
			}
		}
		// Sub ArrAy 1,3
		l=0;
		for(i=0; i<3; i++) {
			for(j=6; j<9; j++) {
				test[l] = arr[i][j];
				l++;
			}
		}
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(i != j)
					if(test[i] == test[j]){
						sum++;
					}
			}
		}
		// Sub ArrAy 2,1
		l=0;
		for(i=3; i<6; i++) {
			for(j=0; j<3; j++) {
				test[l] = arr[i][j];
				l++;
			}
		}
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(i != j)
					if(test[i] == test[j]){
						sum++;
					}
			}
		}

		// Sub ArrAy 2,2
		l = 0;
		for(i=3; i<6; i++) {
			for(j=3; j<6; j++) {
				test[l] = arr[i][j];
				l++;
			}
		}
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(i != j)
					if(test[i] == test[j]){
						sum++;
					}
			}
		}
		// Sub ArrAy 2,3
		l=0;
		for(i=3; i<6; i++) {
			for(j=6; j<9; j++) {
				test[l] = arr[i][j];
				l++;
			}
		}
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(i != j)
					if(test[i] == test[j]){
						sum++;
					}
			}
		}
		// Sub ArrAy 3,1
		l=0;
		for(i=6; i<9; i++) {
			for(j=0; j<3; j++) {
				test[l] = arr[i][j];
				l++;
			}
		}
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(i != j)
					if(test[i] == test[j]){
						sum++;					} 
			}
		}

		// Sub ArrAy 3,2
		l = 0;
		for(i=6; i<9; i++) {
			for(j=3; j<6; j++) {
				test[l] = arr[i][j];
				l++;
			}
		}
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(i != j)
					if(test[i] == test[j]){
						sum++;
					} 
			}
		}
		// Sub ArrAy 3,3
		l=0;
		for(i=6; i<9; i++) {
			for(j=6; j<9; j++) {
				test[l] = arr[i][j];
				l++;
			}
		}
		for(i=0;i<9;i++) {
			for(j=0;j<9;j++) {
				if(i != j)
					if(test[i] == test[j]){
						sum++;
					} 
			}
		}
  if (sum > 0) {
	  System.out.println("Error");
  } else
	  System.out.println("Sucessfull");

	}
}
