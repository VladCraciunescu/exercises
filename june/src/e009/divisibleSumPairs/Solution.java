package e009.divisibleSumPairs;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int k2 = 0;
        int[] arr = new int[n];
        for (int x = 0; x < n; x++) {
            arr[x] = s.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] + arr[j]) % k == 0)
                    k2++;
            }
        }
        System.out.println(k2);
    }
}
//https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
