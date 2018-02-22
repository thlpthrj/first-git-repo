import java.util.Scanner;

public class ElectronicShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        int max=0,result=0;
        char w = 'a';
       int e =(int)w;
       System.out.println("+++++++++"+e);
       for(int i=0;i<keyboards.length;i++){
           for(int j=0;j<drives.length;j++){
        	   int c=keyboards[i]+drives[j];
            if(c>max && c<=s){
                max=c;
            }   
           }
       }
       if(max==0){
    	   return -1;
       }else
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
