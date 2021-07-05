package e019.theHurdleRace;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int i;
        int[] height = new int[n];
        for (i = 0; i < n; i++) {
            height[i] = s.nextInt();
        }
        System.out.println(hurdleRace(k,height));

    }
    static int hurdleRace(int k, int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++)
            if (height[i] > max) max = height[i];
        return (max < k) ? 0 : max-k;
    }
}
//https://www.hackerrank.com/challenges/the-hurdle-race/problem