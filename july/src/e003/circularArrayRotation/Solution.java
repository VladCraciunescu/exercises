package e003.circularArrayRotation;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[(n - (k % n)+ m) % n]);
        }
    }
}
//https://www.hackerrank.com/challenges/circular-array-rotation/problem