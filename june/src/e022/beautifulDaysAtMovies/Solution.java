package e022.beautifulDaysAtMovies;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int i;
        int k = 0;
        for (i = a; i <= b; i++) {

            if (Math.abs((i - reverse(i))) % c == 0)
                k++;
        }
        System.out.println(k);
    }

    public static int reverse(int x) {
        int cnr, inv;
        cnr = x;
        inv = 0;
        while (cnr != 0) {
            inv = inv * 10 + cnr % 10;
            cnr = cnr / 10;
        }
        return inv;
    }
}
//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?h_r=next-challenge&h_v=zen