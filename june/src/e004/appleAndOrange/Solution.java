package e004.appleAndOrange;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();

        int applesOnHouse = 0;
        for (int i = 0; i < m; i++) {
            int applePosition = a + scan.nextInt();
            if (applePosition >= s && applePosition <= t) {
                applesOnHouse++;
            }
        }
        System.out.println(applesOnHouse);

        int orangesOnHouse = 0;
        for (int i = 0; i < n; i++) {
            int orangePosition = b + scan.nextInt();
            if (orangePosition >= s && orangePosition <= t) {
                orangesOnHouse++;
            }
        }
        System.out.println(orangesOnHouse);

        scan.close();
    }
}
//https://www.hackerrank.com/challenges/apple-and-orange/problem?h_r=next-challenge&h_v=zen