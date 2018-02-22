
public class MatrixZigZag {


	public static void main(String args[]){
		int arr[][] = {{1,2,3,4},{4,3,2,1},{7,8,9,6}};
		int i=0,j=0;
		for(i=0;i<arr[0].length;i++){
			if(j<=0){
				for(j=0;j<arr.length;j++){
					System.out.print(arr[j][i]+" ");
				}
			}else{
				for(j=arr.length-1;j>=0;j--){
					System.out.print(arr[j][i]+" ");
				}
			}
		}
	}
}
