
public class Customer {
	private String name;
	private int age,pnr,price;
	
	public Customer(String name, int age, int pnr, int price) {
		this.name = name;
		this.age = age;
		this.pnr = pnr;
		this.price = price;
	}
	
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
	public void setPnr(int id) {
		this.pnr = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
