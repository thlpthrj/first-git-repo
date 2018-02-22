
public class arraysort {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11}, i,j=0;
		int sort[] = new int[arr.length];
		for(i=arr.length-1 ;i>-1 && j<sort.length ;i--) {
			//sort[i+1] = arr[i];
			sort[j] = arr[i];
			j=j+2;
		}
		i=0;
		for(j=1; j<arr.length && i<arr.length/2 ;j++,++j) {
			sort[j] = arr[i];
			i++;
		}

		for(i=0; i<sort.length;i++) 
			System.out.println(sort[i]);
	}
}
