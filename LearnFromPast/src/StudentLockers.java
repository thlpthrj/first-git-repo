import java.util.Scanner;


public class StudentLockers {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int noOfStudents = scan.nextInt();
		int noOfLockers = scan.nextInt();
		int arr[] = new int[noOfLockers];
		for(int i=0; i<noOfStudents;i++){
			if(i==0){
			for(int j=0;j<arr.length;j++){
				arr[j]=1;
			}
			}
			if(i==1){
				for(int j=i;j<arr.length;j+=2){
					arr[j]=0;
				}
			}
			if(i>1){
				for(int j=i;j<arr.length;j=j+i+1){
					if(arr[j]==0){
						arr[j]=1;
					}else{
						arr[j]=0;
					}
				}
			}
		}
		for(int j =0;j<arr.length;j++){
			if(arr[j]==1)
			System.out.println(j+1);
		}
	}
}
