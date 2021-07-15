package e001.viralAdvertising;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int total = 0, shared, i;
        shared = 5;
        for (i = 1; i <= n; i++) {
            total = total + shared / 2;
            shared = (shared / 2) * 3;
        }
        System.out.println(total);
    }
}
//https://www.hackerrank.com/challenges/strange-advertising/problem