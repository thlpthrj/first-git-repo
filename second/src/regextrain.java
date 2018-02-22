import java.util.regex.Pattern;


public class regextrain {
	public static void main(String args[]) {
		String str = "a1b2c1d1e6";
		int count=0,sum=0;
		Pattern pt = Pattern.compile("[a-z]");
		Pattern po = Pattern.compile("[0-9]");
		String[] parts = pt.split(str);
		String[] alpha = po.split(str);
		//System.out.println(parts.length+"/////"+alpha.length);
		for(int i=1; i<parts.length ; i++) {
			if(Integer.valueOf(parts[i])> 10) 
				count++;
		}
		if(Integer.valueOf(parts[parts.length-1]) > 10) {
			sum++;
		}
		//System.out.println(count+"^^^^^");
		if (parts.length-1 == alpha.length-count+sum)  {

			System.out.println("\n");
			int j=1;

			for(int i=0; i<alpha.length; i++) {
				for(int k=0; k <Integer.valueOf(parts[j]); k++)
					System.out.print(alpha[i]);
				if(Integer.valueOf(parts[j]) > 10) 
					i++;
				j++;
			}
		}else
			System.out.println("String is not valid");

	}
}
