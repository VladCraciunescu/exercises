package e002.saveThePrisoner;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            int last = ((m - 1) + (s - 1)) % n + 1;
            System.out.println(last);
        }
    }
}
//https://www.hackerrank.com/challenges/save-the-prisoner/problem?h_r=next-challenge&h_v=zen