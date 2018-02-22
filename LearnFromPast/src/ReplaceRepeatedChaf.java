import java.util.Scanner;


public class ReplaceRepeatedChaf {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String res="";
		String str2=str.toLowerCase();
		char t[] = str2.toCharArray();
		int i=0,j;
		for(i=0;i<str2.length();i++){
			for(j=i+1;j<str2.length();j++){
				if(str2.charAt(i)==str2.charAt(j)){
					res="";
					if(str2.charAt(j)=='9'){
						t[j]='0';
					}else{
						int ascii=(int)str2.charAt(j);
						t[j]=(char)++ascii;
					}
					for(int k=0;k<t.length;k++){
						res=res+t[k];
					}
					str2=res;
				}}
		}
		res="";
		for(i=0;i<t.length;i++){
			if(Character.isUpperCase(str.charAt(i))){
				t[i]=Character.toUpperCase(t[i]);
			}
		}
		for(int k=0;k<t.length;k++){
			res=res+t[k];
		}
		System.out.println(res);
	}
}
