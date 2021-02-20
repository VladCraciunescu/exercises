package e008.runnigTimeAndComplexity;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int n;
        boolean ok;
        for (int i = 0; i < T; i++) {
            n = s.nextInt();
            ok = true;
            if (n == 1) {
                System.out.println("Not prime");
            } else {
                for (int j = 1; j <= sqrt(n); j++) {
                    if (n % j == 0 && j != 1 && j != n) {
                        ok = false;
                        break;
                    }
                }
                System.out.println(ok == true ? "Prime" : "Not prime");

            }
        }
    }
}

//https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem