package e004.sequenceEquation;

import java.util.Scanner;

public class Solution {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] p_inverse = new int[n + 1];
        for (int x = 1; x <= n; x++) {
            int px = scan.nextInt();
            p_inverse[px] = x;
        }
        scan.close();

        for (int x = 1; x <= n; x++) {
            int y = p_inverse[p_inverse[x]];
            System.out.println(y);
        }
    }
}
//https://www.hackerrank.com/challenges/permutation-equation/problem