package Hackerearth;
import java.util.Scanner;
class Anagrams {
    final static int CHARS = 26;
    static int countDeletions(String str1, String str2) {
        int arr[] = new int[CHARS];
        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            arr[str2.charAt(i) - 'a']--;
        }
        int ans = 0;
        for (int i = 0; i < CHARS; i++) {
            ans += Math.abs(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            System.out.println(countDeletions(str1, str2));
        }
    }
}