import java.util.*;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] hike = scan.next().toCharArray();
        
        int count = 0;
        int altitude = 0;
        
        for(char c : hike) {
            if(c == 'U') {
                if(altitude == -1) {
                    count++;
                }
                altitude++;
            }
            else {
                altitude--;
            }
        }
        System.out.println(count);
    }
}