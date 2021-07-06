package e021.angryProfessor;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        int n, k, j, k2;
        int t = s.nextInt();
        {
            for (i = 0; i < t; i++) {
                n = s.nextInt();
                k = s.nextInt();
                k2 = 0;
                int[] arr = new int[n];
                for (j = 0; j < n; j++)
                    arr[j] = s.nextInt();
                for (j = 0; j < n; j++) {
                    if (arr[j] <= 0)
                        k2++;
                }
                if (k2 <= k)
                    System.out.println("YES");

                else
                    System.out.println("NO");
            }
        }
    }
}
//https://www.hackerrank.com/challenges/angry-professor/problem
