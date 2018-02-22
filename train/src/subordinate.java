
public class subordinate {
	public static void main(String args[]) {
		int i,number = 100000,j,len,sum=0;
		String test;
		for(i=0; i< number;i++) {
			test=String.valueOf(i);
			len = test.length();
			sum =0;
			for(j=0;j<len; j++) {
				if(test.charAt(j) == '3')
					sum++;
				if(test.charAt(j) == '2')
					sum++;
			}
			if(sum == len) {
				System.out.println(test);
			}
		}
	}
}
