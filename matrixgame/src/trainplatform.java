
public class trainplatform {
	//platform for evry movement

	public static int[] FindPlatform(int[] a, int[] arrival,int[]depart) {
		int[] plat = new int[a.length];
		int i,j,sum=0;
		for(i=0;i < a.length; i++) {
			for( j=0;j<arrival.length; j++) {
				if(a[i] == arrival[j])
					plat[i]= sum++;
				else if(a[i] == depart[j])
					plat[i] = sum--;
			}
		}
		return plat;

	}

	//Finding Platform
	public static int FindMax(int plat[]) {
		int max=0;
		for(int i=0 ; i <plat.length; i++) {
			if(max < plat[i])
				max = plat[i];
		}
		return max;

	}

	//Main Function
	public static void main(String args[]) {
		int[] arr = {900,940,950,1100,1500,1800};
		int[] dep = {910,1200,1120,1130,1900,2000};
		int[] merg = new int[arr.length+dep.length];
		int[] plat= new int[merg.length];
		int i,j=0,tmp,max;
		for(i=0; i < merg.length; i++) {
			if(i< merg.length/2)
				merg[i] = arr[i];
			else if(i >= merg.length/2) {
				merg[i] = dep[j];
				j++;
			}
		}

		for(i=0;i<merg.length;i++) {
			for(j=0; j< merg.length; j++) {
				if(merg[i] < merg[j]) {
					tmp = merg[j];
					merg[j] = merg[i];
					merg[i] = tmp;
				}
			}
		}
		plat = FindPlatform(merg,arr,dep);
		max = FindMax(plat);
		System.out.println("Minimum Platform "+max);

	}

}
