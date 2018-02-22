
public class TaxiDetails {

	private int taxiNo;
	private double fare;
	private int time,distance;
	String curr_location;
	String history;
	
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = this.history+"\n"+history;
	}
	public int getTaxiNo() {
		return taxiNo;
	}
	public void setTaxiNo(int taxiNo) {
		this.taxiNo = taxiNo;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = this.fare+fare;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getCurr_location() {
		return curr_location;
	}
	public void setCurr_location(String curr_location) {
		this.curr_location = curr_location;
	}
	
	
	
}
