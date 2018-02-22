import java.util.Scanner;


public class MainClass {
	private static int seats = 10;
	private static long pnr = 4568567;
	private static int seatno = 1; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		BookedTicket bt[] = new BookedTicket[10];
		MainClass mc = new MainClass();
		String user="abc";
		String pass="123";
		String usr,pss;
		System.out.println("***Welcome to Southern Railways*** ");
		for(int i=0; i<mc.seats; i++) {
			System.out.println("Please Enter Your Username and Password ");
			usr = sc.next();
			pss = sc.next();
			if(user.equals(usr) && pass.equals(pss)) {
				boolean flag = true;
				while(flag) {
					//System.out.println("+++++++++0"+i+"+++++++++0");
					System.out.println("1.Booking\n2.Check Availablity\n3.Cancellation\n4.Chart Display\n5.Change Password\n6.Sign-Out and Exit");
					int opt;
					opt = sc.nextInt();
					switch(opt) {
					case 1: 
						//System.out.println("++++++"+i);
					i=ticketsBooking(bt,i);
					break;
					case 2: System.out.println("Available seats "+mc.seats);
					break;
					case 3: System.out.println("Enter Your PNR number");
					int temp = sc.nextInt();
					i=cancelationOfTickets(temp,bt,i);
					break;
					case 4: chartDisplay(bt,i);
					break;
					case 5: System.out.println("Enter Your Current Password");
					String tem = sc.next();
					if(pass.equals(tem)) {
						System.out.println("Enter Your New Password");
						pass = sc.next();
						System.out.println("Youe Password changed Successfully");
					}
					break;
					case 6 : flag = false;
					System.out.println("Thank You :-) Please Visit again\n\n");
					break;
					default : System.out.println("Invalid Option");
					}

				}

			} else {
				System.out.println("Invalid Username and Passwrd");
			}

		} 
	}


	private static void chartDisplay(BookedTicket[] bt, int i) {
		System.out.println("PNR\t Name\t Age \t Gender \t Seat.No");
		// TODO Auto-generated method stub
		for(int j=0; j<i; j++) {
			System.out.println(bt[j].getPnr()+" \t"+bt[j].getName()+" \t"+bt[j].getAge()+" \t"+bt[j].getGender()+" \t"+bt[j].getSeat_no());
		}

	}


	private static int cancelationOfTickets(int temp, BookedTicket[] bt, int i) {
		// TODO Auto-generated method stub
		int k = 0;
		boolean flag =false;
		//System.out.println(i+"+++++");
		for(int j=0; j<i; j++) {
			//	System.out.println(bt[j].getPnr()+"  ?????"+j);
			if(bt[j].getPnr() == temp) {
				flag = true;
				//System.out.println("GETIN "+j);
				for(k=j;k<i-1;k++) {
					bt[k] = bt[k+1];
					seats++;
				}
			}

		}
		if(flag == true) {
			bt[k] = null;
			i--;

		} else {
			System.out.println("Invalid PNR");

		}
		return i;
	}


	private static int ticketsBooking(BookedTicket[] bt, int i) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("+++++++"+i);
		int p,age; String name,gen;
		System.out.println("Please Enter No.Of Tickets");
		p=sc.nextInt();
		if(p<=seats) {
			while(p !=0){
				bt[i] = new BookedTicket();
				System.out.println("Enter Your Name");
				name = sc.next();
				System.out.println("Enter Your Age");
				age = sc.nextInt();
				System.out.println("Enter Your Gender");
				gen = sc.next();
				//System.out.println(name+"   "+age+"  "+gen+" "+pnr);
				bt[i].setName(name);
				bt[i].setAge(age);
				bt[i].setPnr(pnr);
				bt[i].setSeat_no(seatno);
				bt[i].setGender(gen);
				System.out.println("Your Ticket Booked Successfully and Your PNR is "+pnr);
				pnr++;
				p--;
				i++;
				seatno++;
				seats--;
			}
		} else {
			System.out.println("Required Tickets are Not Available :-(\nPlease Try Again\n\n");
		}
		return i;
	}

}
