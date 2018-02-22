
public class sorting {
	public static void main(String args[]) {

		int arr[] = {9,8,7,6,5,4,3,2,1,11};
		int test[] = new int[arr.length];

		for(int i=0;i < arr.length; i++) {
			for(int j=0; j< arr.length; j++) {

				if(arr[i] < arr[j]){
					arr[i] = arr[i]+arr[j];
					arr[j] = arr[i]-arr[j];
					arr[i] = arr[i]-arr[j];
				}


			}

		}
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		int j=0;
		for(int i=1; i<arr.length;i=i+2) {
			test[j] = arr[i];
			j=j+2;
		}
		j=1;
		for(int i=0; i< arr.length;i=i+2) {
			test[j] = arr[i];
			j=j+2;
		}
		System.out.println("");
		for(int i=0; i<arr.length; i++) {
			System.out.print( test[i]+" ");
		}

	}

}
