
public class factorssort {
	public static void main(String args[]) {
		int[] arr = {8,2,3,12,16};
		int[] sorted = new int[arr.length];
		int i,j,count, temp=0,po;
		//int[] copy = new int[arr.length];
		//int[] disp = new int[arr.length];
		for(i=0 ; i<arr.length ; i++) {
			count=0;
			for(j=1; j<arr[i]/2 ; j++) {
				if(arr[i]%j == 0)
					count++;
			}
			sorted[i] = count;
		}
		//for(i =0 ; i < arr.length; i++)
			//copy[i] = sorted[i];
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr.length; j++) {
				if(sorted[i] > sorted[j]) {
					temp = sorted[j];
					sorted[j] = sorted[i];
					sorted[i] = temp;
					po = arr[j];
					arr[j] = arr[i];
					arr[i]= po;
				}
			}
		}
		for(i=0; i< arr.length; i++)
			System.out.println(arr[i]);

		/*System.out.println("\n");
		for(i=0; i<sorted.length;i++)
			for(j=0; j<copy.length; j++) {
				if(sorted[i] == copy[j]) {
					System.out.println(i+" "+j+" "+copy[j]+" "+sorted[i]);
					disp[i] = arr[j];
					//arr[i] = arr[j];
					//arr[j] = temp; 
					arr[j]++;
				}
			}
		System.out.println("\n");
		for(i=0; i< arr.length; i++)
			System.out.println(disp[i]); */
	}
}
