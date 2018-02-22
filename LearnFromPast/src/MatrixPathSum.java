
public class MatrixPathSum {

	public static void main(String args[]){
		int arr[][] = {{1,10,10,12},{4,5,6,12},{7,8,9,12}};
		int sum=arr[0][0];
		System.out.println(getSum(0,0,sum,arr));

	}

	private static int getSum(int i, int j, int sum, int[][] arr) {
		int down=0,right=0;
		if(i<arr.length&& j<arr[0].length){
		if((i<arr.length-1)){
			down=arr[i+1][j];
		}else{
			down=0;
		}
		if(j<arr[0].length-1){
			right=arr[i][j+1];
		}else{
			right=0;
		}
		if(down>right){
			sum=sum+down;
			i++;
		}else{
			sum=sum+right;
			j++;
		}
			sum=getSum(i, j, sum, arr);
		}
			return sum;
	}
}
