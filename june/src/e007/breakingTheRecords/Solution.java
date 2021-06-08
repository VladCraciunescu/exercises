package e007.breakingTheRecords;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int score = s.nextInt();
        int min = score;
        int max = score;
        int maxcount = 0, mincount = 0;
        for (int i = 1; i < n; i++) {
            score = s.nextInt();
            if (score > max) {
                max = score;
                maxcount++;
            }
            if (score < min) {
                min = score;
                mincount++;
            }
        }
        System.out.println(maxcount + " " + mincount);
    }
}
//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?h_r=next-challenge&h_v=zen