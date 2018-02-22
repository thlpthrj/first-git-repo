import java.util.Scanner;

public class MainClass {
	private static int id = 1; 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String arr[] = {"A","B","C","D","E","F"};
		System.out.println("WELCOME TO CHENNAI CABS");
		TaxiDetails td[] = new TaxiDetails[4];
		for(int i=0; i<4; i++) {
			td[i] = new TaxiDetails();
			td[i].setCurr_location("A");
			td[i].setDistance(0);
			td[i].setFare(0);
			td[i].setTaxiNo(i+1);
			td[i].setTime(0);
			td[i].setHistory(" ");
		}
		MainClass ms  = new MainClass();
		int j=0;
		boolean tr=true;
		while(tr) {
			System.out.println("1.Booking\n2.Details");
			int opt = sc.nextInt();
			switch(opt) {
				
			case 1: 
				System.out.println("Your Booking Id is "+id);
			id++;
			System.out.println("Enter PickUp Location ");
			String pickup = sc.next();
			System.out.println("Enter Drop Location");
			String drop = sc.next();
			System.out.println("Enter the PickUp time");
			int time = sc.nextInt();
			int a = 0,b = 0, diff;
			for(int i=0; i< arr.length; i++) {
				if(arr[i].equals(pickup))
					a=i;
				if(arr[i].equals(drop))
					b=i;
			}
			if(a>b){
				diff=a-b;
			} else {
				diff=b-a;
			}
			//System.out.println(a+"   "+b);
			booking(td,pickup,drop,time,a,arr,diff);
			break;

			case 2: dispDetails(td);
			break;

			case 3: tr=false;
			System.out.println("Thank You");
			break;

			default : System.out.println("Invallid Option");
			}

		}
	}

	private static void dispDetails(TaxiDetails[] td) {
		// TODO Auto-generated method stub
		System.out.println("Booking-Id\tTaxi-No\tFare\tPick-up\tDrop\tPickup Time\t DropTime");
		for(int i=0; i<4; i++) {
			if(td[i].getHistory() != null) {
				//System.out.println("Total Amount"+td[i].getFare());
				System.out.println(td[i].getHistory());
			}
		}
	}

	private static void booking(TaxiDetails[] td, String pickup, String drop,int time, int a, String[] arr, int diff) {
		double fare=0.0;
		int k=0,sub=0,tem=0,r=0;
		int min,minfare;
		String history;
		int flag= 0;
		boolean thing = false;
		//System.out.println(a+"           "+diff+"   "+flag);
		boolean tag= false;
		for(int i=0; i< 4; i++) {
			//System.out.println(td[i].getCurr_location()+" "+pickup);
			if(td[i].getCurr_location().equals(pickup)) {
				//System.out.println("Same Location");
				if(td[i].getTime() <= time) {
					//System.out.println("Same Time");
					td[i].setCurr_location(drop);
					int dtime = time + (diff);
					td[i].setTime(dtime);
					fare = fare+100+((diff*15)-5)*10;
					td[i].setFare(fare);
					td[i].setDistance(diff*15);
					System.out.println("Taxi.No "+td[i].getTaxiNo()+" is alloted");
					history = id-1+"\t"+td[i].getTaxiNo()+" \t"+td[i].getFare()+" \t"+pickup+" \t"+drop+" \t"+time+" \t"+dtime;
					td[i].setHistory(history);
					flag=1;
					thing = true;
				//	System.out.println(flag+" booKED");
					break;
				}
			}
		}
		//System.out.println(flag+" Rest");
		if (flag == 0) {
			int j=0;
			min = 6;
			minfare = 10000;
			for( j=0; j < 4; j++) {
				for(int m=0; m<arr.length;m++) {
					if(td[j].getCurr_location().equals(arr[m])){
						if(td[j].getTime() < time) {
							if(a> m) {
								sub= a-m;
							} else
								sub = m-a;
							if(min> sub) {
								min=sub;
								tem = j;
								tag=true;
					//			System.out.println(flag+"******");
							}
						}
					}
				}
			}
			for( j=0; j < 4; j++) {
				for(int m=0; m<arr.length;m++) {
					if(td[j].getCurr_location().equals(arr[m])){
						if(td[j].getTime() < time) {
							if(a> m) {
								sub= a-m;
							} else
								sub = m-a;
							if(min == sub) {
								if(td[tem].getFare() > td[j].getFare()){
									tem = j;
									tag=true;
				//					System.out.println(flag+"%%%%");
								}
							}
						}
					}
				}
			}
			if(tag == true) {
			//	System.out.println("Calling Booking");
				td[tem].setCurr_location(pickup);
				booking(td,pickup,drop,time,a,arr,diff);
				flag = 1;
			}
		}
		//System.out.println(flag+"REST1");
		if(flag == 0) {
			System.out.println("Sorry,Cab Not Avail Now:-(, Please Wait or Try Later");
			
		}
	}
}
