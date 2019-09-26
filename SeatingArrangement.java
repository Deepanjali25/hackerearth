package Hackerearth;
import java.util.Scanner;
class SeatingArrangement {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        if(s.hasNextInt()){
            n  = s.nextInt();
        }
        while(n-- > 0){
            int seatNum  = s.nextInt();
            int facingSeatNum = 13 - (seatNum % 12);
            if(facingSeatNum == 13){
                facingSeatNum = 1;
                seatNum--;
            }
            facingSeatNum = facingSeatNum + 12 *  (seatNum / 12);
            int seatType = facingSeatNum % 6;
            String type = "AS";
            if(seatType == 0 || seatType == 1){
                type = "WS";
            }
            else if(seatType == 2 || seatType == 5) {
                type = "MS";
            }
            System.out.println(facingSeatNum + " " + type);
        }
    }
}