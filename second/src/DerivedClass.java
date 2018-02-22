
public class DerivedClass extends BaseClass{
	
	public void Print() {
		System.out.println("DERIVED");
	}
	public void Task() {
		System.out.println("Crack");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass bc = new BaseClass();
		BaseClass dc = new DerivedClass();
	}

}
