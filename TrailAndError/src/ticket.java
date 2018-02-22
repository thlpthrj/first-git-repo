import java.util.*;


public class ticket {
	private static int total= 5;
	private static int pnr = 1000;
	HashMap<Integer,String> NameList = new HashMap<Integer,String>();
	HashMap<Integer,Integer> AgeList  = new HashMap<Integer,Integer>();
	HashMap<Integer,Integer> SeatList  = new HashMap<Integer,Integer>();


	public void booking(int ticket) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		if(ticket == 0){
			System.out.println("\nEnter the No.Of Tickets");
			ticket = sc.nextInt();
		}
		for(int i=0; i<ticket; i++) {
			System.out.println("\nEnter Your Name");
			name = sc.next();
			System.out.println("Enter you age ");
			age = sc.nextInt();
			NameList.put(pnr,name);
			AgeList.put(pnr,age);
			SeatList.put(pnr,total);
			System.out.println("\nYour Seats Successfully Booked");
			System.out.println("Your PNR number is "+pnr);
			pnr++;
			total--;
		}
		//System.out.println(NameList.get(--pnr)+"\t\t"+pnr);
		Option();
	}

	public int reservation() {
		int tickets;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the No.Of Tickets Needed ");
		tickets = sc.nextInt();
		if(tickets < total) {
			System.out.println("\nRequired Tickets are Available");
			Option();
			return tickets;
		}
		else {
			System.out.println("\n Sorry, Required Tickets Not Available");
			Option();
			return 0; 
		}
	}
	public void Cancel() {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("\nPlease Enter you PNR number");
		number = sc.nextInt();
		NameList.remove(number);
		AgeList.remove(number);
		SeatList.remove(number);
		total++;
		Option();
	}

	//@SuppressWarnings("rawtypes")
	public void disp() {

		System.out.println("\nPNR\t\tName\t\tAge\t\tSeat\t\t");
		Set se = NameList.entrySet();
		Iterator iy = se.iterator();
		while(iy.hasNext()) {
			Map.Entry keyvalue = (Map.Entry)iy.next();
			System.out.println("Element is  "+keyvalue.getKey()+"  "+keyvalue.getValue());
		}
		
	Option();
	}
	public void Option() {
		Scanner sc = new Scanner(System.in);
		ticket t = new ticket();
		int opt,tick=0;
		System.out.println("\n1.Check Availablity\n2.Booking\n3.Cancellation\n4.Chart Display\n5.End Operation");
		System.out.println("\nPlease Enter Your Option ");
		opt = sc.nextInt();
		switch(opt) {
		case 1: tick = t.reservation();
		break;
		case 2: t.booking(tick);
		break;
		case 3: t.Cancel();
		break;
		case 4: t.disp();
		break;
		case 5: System.out.println("\nThank You\nPlease Visit Again");
		break;
		default: System.out.println("\nInValid Selection");
		break;
		}
	}

		public static void main(String args[]){
			//int opt,tick=0;
			System.out.println("\n WELCOME TO SOUTHERN RAILWAYS");
			ticket rail = new ticket();
			rail.Option();
		}



	}
