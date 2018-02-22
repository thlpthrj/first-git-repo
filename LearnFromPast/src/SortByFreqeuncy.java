import java.util.Scanner;


public class SortByFreqeuncy {
	public static void main(String rgs[]){
		Scanner scan = new Scanner(System.in);	
		int size = scan.nextInt();
		int arr[] = new int[size];
		int i,j,temp;
		for(i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		for(i=0;i<size;i++){
			for(j=i;j<size;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		j=0;
		int[] temp1 = new int[size];int l=0,k;
		for (i=0; i<size-1; i++)
			if (arr[i] != arr[i+1])
				temp1[j++] = arr[i];
		temp1[j++] = arr[size-1];
		
		int res[][]= new int[j][2];
		for(i=0;i<j;i++){
			l=0;
			for(k=0;k<size;k++){
			if(temp1[i]==arr[k]){
				l++;
			}
			}
			res[i][0]=temp1[i];
			res[i][1]=l;
		}
		l=0;
		for(i=0;i<j&& l<size;i++){
			for(k=0;k<res[i][1];k++){
				arr[l]=res[i][0];
				l++;
			}
		}
		for(i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
