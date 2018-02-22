
public class SeatAvail {

	private String name;
	private int age,pnr,seatno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public int getSeat() {
		return seatno;
	}
	public void setSeat(int seat) {
		this.seatno = seat;
	}
	public SeatAvail(int pnr, String name, int age, int seatno) {
		this.age=age;
		this.name = name;
		this.pnr=pnr;
		this.seatno = seatno;
		
		
	}

}
