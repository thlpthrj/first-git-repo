
public class NumbersWeight {

	public static void main(String[] args){
		int[] arr={10, 36, 54,89,12};
		int[][] weightArr= new int[arr.length][2];
		int i=0,weight=0;
		for(i=0;i<arr.length;i++){
			weightArr[i][0] = arr[i];
			weightArr[i][1]=getWeight(arr[i]);
		}
		for(i=0;i<weightArr.length;i++){
			System.out.println("<"+weightArr[i][0]+","+weightArr[i][1]+">");
		}
	}

	private static int getWeight(int i) {
		int weight=0,j=1;
		boolean isSquare=true;
		while(j<i/2 && isSquare){
			if(j*j==i){
				isSquare=false;
				weight=weight+5;
			}
			j++;
		}
		if(i%4==0 && i%6==0)
			weight=weight+4;
		
		if(i%2==0)
			weight=weight+3;
		return weight;
	}
	
	
}
