package Hackerearth;
import java.util.Scanner;
public class FindProduct {
    public static void main (String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        long ans=1;
        long m= (long) Math.pow(10,9)+7;
        while(n>=1){
            int i= scanner.nextInt();
            ans=(ans*i)%m;
            n--;
        }
        System.out.println(ans);
    }
}
