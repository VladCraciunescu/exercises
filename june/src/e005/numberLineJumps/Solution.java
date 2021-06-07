package e005.numberLineJumps;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int v1 = s.nextInt();
        int x2 = s.nextInt();
        int v2 = s.nextInt();
        int t = 0;
        if ((v2 - v1) == 0) {
            System.out.println("NO");
        } else {
            t = (x1 - x2) % (v2 - v1);
            if (v1 > v2) {
                if (t == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else if (v1 <= 2 || v2 <= 2)
                System.out.println("NO");
            else
                System.out.println("NO");
        }
    }

}
//https://www.hackerrank.com/challenges/kangaroo/problem

