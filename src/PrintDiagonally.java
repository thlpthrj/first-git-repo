
public class PrintDiagonally {

	public static void main(String[] args){
		String str = "sowmiya";
		char[][] arr = new char[str.length()][str.length()];
		int i;
		int j;
		for(i=0;i<str.length();i++){
			for(j=0;j<str.length();j++){
				arr[i][j]=' ';
			}
		}
		for(i=0;i<str.length();i++){
			arr[i][i] = str.charAt(i);
		}
		for(i=0,j=str.length();i<str.length()&&j>0;i++,j--){
			arr[i][j-1] = str.charAt(j-1);
		}
		for(i=0;i<str.length();i++){
			for(j=0;j<str.length();j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
