
public class sortinplace {
	public static void main(String args[]) {
		int[] arr = {7,6,5,4,3,2,1};
		int i,j,temp;
		for(i=0; i<arr.length;i++) {
			for(j=0; j< arr.length;j=j+2) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		for(i=0;i<arr.length; i++)
			System.out.println(arr[i]);
	}

}
