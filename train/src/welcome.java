import java.util.*;


public class welcome {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		String check= "welcometozohocorporation ";
		String test;
		char arr[][] = new char[5][5];
		int count=0;
		List<Integer> li = new ArrayList<Integer>();
		int i,j,k,l,sum=0;

		for( i=0; i<5; i++) {
			for( j=0;j<5;j++) {
				if(check.charAt(count) !='\0') {
					arr[i][j] = check.charAt(count);
					count++;
				} 
			}
		}

		for( i=0; i<5;i++) {
			for( j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("\nEnter the String to be searched...");
		test = sc.next();
		char t[]= new char[test.length()];

		//column iteration
		//	int iteration(int cat) {
		for( i=0;i<5;i++) {
			for( j=0;j<5;j++) {
				l=j;
				li.clear();
				for( k=0;k<test.length()&& j+test.length() <=5 ;k++) {
					t[k]= arr[i][l];
					li.add(i);
					li.add(l);
					l++;

				}

				String pool = String.valueOf(t);
				if(pool.equals(test)) {
					sum++;
					System.out.println("Staring is "+li.get(0)+","+li.get(1)+"\nEnding is "+li.get(li.size()-2)+","+li.get(li.size()-1));
					break;
				}
			}
		}

		// row iteration
		for( i=0;i<5;i++) {
			for( j=0;j<5;j++) {
				l=j;
				li.clear();
				for( k=0;k<test.length()&& j+test.length() <=5 ;k++) {
					t[k]= arr[l][i];
					li.add(l);
					li.add(i);
					l++;
				}
				String pool = String.valueOf(t);
				if(pool.equals(test)) {
					sum++;
					System.out.println("Staring is "+li.get(0)+","+li.get(1)+"\nEnding is "+li.get(li.size()-2)+","+li.get(li.size()-1));
					break;
				}
			}
		} 
		if(sum == 0)
			System.out.println("No String is available");

	}
}
