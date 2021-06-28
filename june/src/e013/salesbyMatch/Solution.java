package e013.salesbyMatch;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
//https://www.hackerrank.com/challenges/sock-merchant/problem?h_r=next-challenge&h_v=zen