import java.util.Scanner;

public class LeapYearFind {

    static String solve(int year){
        int sum=215;
        if(year<=1917){
            if(year%4==0){
                sum=sum+29;
            }else{
                sum=sum+28;
            }
        }else if(year ==1918){
            sum=sum+15;
        }else {
            if(year%400==0||(year%4==0&& year%100!=0)){
                 sum=sum+29;
            }else{
                 sum=sum+28;
            }
        }
        String result= (256-sum)+".09."+year;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
