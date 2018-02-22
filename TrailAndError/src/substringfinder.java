
public class substringfinder {
	public static void main(String args[]) {
		String str = "SowmiyaRaj";
		String str1 = "Raj";
		int temp=-1,p=0,k=0;
		for(int i=0; i<str.length()-str1.length()-1; i++) {
			p=0;
			for(int j=i; j<i+str1.length();j++) {
				if(str.charAt(j) == str1.charAt(p)){
					System.out.println(str1.charAt(p)+"**"+str.charAt(j)+"***"+p+"///"+j+"  "+(i+str1.length()));
					p++;
					temp = j;
					k++;
				}
			}
		}
		if(k == 3)
			System.out.println(temp);
		else
			System.out.println(temp+"^^^^");
	}
}
