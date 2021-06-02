package e054.staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {


    public static void staircase(int n) {
        int k;
        for (int i = 1; i <= n; i++) {
            k = i;
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            while (k > 0) {
                System.out.print("#");
                k--;
            }
            System.out.println();
        }


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
//https://www.hackerrank.com/challenges/staircase/problem