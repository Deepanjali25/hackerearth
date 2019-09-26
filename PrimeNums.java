package Hackerearth;
import java.util.Scanner;
class PrimeNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPrimeNums(n);
    }
    static boolean findPrimeNums(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i=2; i<n; i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }
      static void printPrimeNums(int n) {
        for (int i=2; i<n; i++) {
            if (findPrimeNums(i))
                System.out.print(i + " ");
        }
    }
}