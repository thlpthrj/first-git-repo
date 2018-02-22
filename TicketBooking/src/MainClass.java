import java.util.Scanner;


public class MainClass {
	private static int ticketCount = 10;
	static int pnr=1234;


	public static void booking(int req,Customer c[]) {
		Scanner ty =new Scanner(System.in);
		for(int i=0;i<req;i++)
			System.out.println("Enter you Name and Age");


	}
	public static void main(String[] args) {

		Scanner ty =new Scanner(System.in);
		Customer c[] = new Customer[10];
		for(int i=0;i<3;i++) {
		//= (Customer) new Customer();
			int req;
			boolean flag = true;
			while(flag) {
				System.out.println("Enter the No.Of.Tickets Needed\t");
				req = ty.nextInt();
				if(req < ticketCount) {
					booking(req,c);
				}

			}


		}

	}}
