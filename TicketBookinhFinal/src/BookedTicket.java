
public class BookedTicket {

	private long pnr;
	private int seat_no,age;
	private String name,gender;
	
	public long getPnr() {
		return pnr;
	}
	public void setPnr(long pnr) {
		this.pnr = pnr;
	}
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public BookedTicket(long pnr, int seat_no, int age, String name,String gender) {
	//	super();
		this.pnr = pnr;
		this.seat_no = seat_no;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	public BookedTicket() {
		//super();
	}
	
	

}
