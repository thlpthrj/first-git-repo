import java.io.IOException;
import java.util.Scanner;


public class OddNumbersBetweenRange {

	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
//		final String fileName = System.getenv("OUTPUT_PATH");
//		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		int[] res;
		int _l;
		_l = in.nextInt();

		int _r;
		_r = in.nextInt();

		res = oddNumbers(_l, _r);
		for(int res_i=0; res_i < res.length; res_i++) {
			System.out.println(res[res_i]);;
		}

	}

	/*
	 * Complete the function below.
	 */

	static int[] oddNumbers(int l, int r) {
		int[] result= new int[(r-l)/2 +1];
		int j=0;
		for(int i=l;i<=r;i++){
			if(i%2 == 1){
				result[j]=i;
				j++;
			}
		}
		return result;
	}


}

