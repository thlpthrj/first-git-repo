
public class digitshuffle {
	public static int Fact(int f) {
		int prod=1;
		while(f>0) {
			prod = prod*f;
			f--;
		}
		return prod;
	}
	public static void main(String args[]) {
		int digit = 1234;
		String len =Integer.toString(digit);
		int fact = Fact(len.length());
		int[] digi = new int[fact];
		int k=0;

		for(int i=1000; i< 5000; i++) {
			int sum=0;
			String num = Integer.toString(i);
			for(int j=0; j<num.length();j++) {
				if(num.charAt(j) == '1' )
					sum++;
				if(num.charAt(j) == '2')
					sum++;
				if(num.charAt(j) == '3')
					sum++;
				if(num.charAt(j) == '4')
					sum++;
			}
			if(sum == num.length()) {
				System.out.println(num);
				digi[k] = Integer.valueOf(num);
				k++;
			}
		}
		for(int p=0; p<digi.length; p++)
			System.out.println(digi[p]);
	}
}
