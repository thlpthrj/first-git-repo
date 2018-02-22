
public class Student {
  public int id;
  public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getHistory() {
	return history;
}


public void setHistory(String history) {
	this.history = history;
}


public String history;
	
	
	public static void fid(int a,int b) {
		int temp=0;
	/*	if(a/b > 0 ) {
			 temp = a/b;
			 fid(a/b,b);
			System.out.print(a%b+"%%");
			//return 0 ;
		} else
			System.out.print(temp+"//");
			//return 0;
	
		*/
		if(a==0)
			return;
		else{
			fid(a/b,b);
			System.out.print((a%b));
		 }
	}
 
 
 public static void main(String args[]) {
	 Student[] st = new Student[10];
	 for(int i=0;i<2;i++)
	 {
		 st[i]=new Student();
		 purchase(st[i]);
	 }
 }
 public static void purchase(Student st)
 {
	 int amout=100;
	 String histoy="history";
	 st.setId(amout);
	 st.setHistory(histoy);
	 	 
 }
}
