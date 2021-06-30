package e015.catsAndAMouse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (Math.abs(C - A) > Math.abs(C - B))
                System.out.println("Cat B");
            else if (Math.abs(C - A) < Math.abs(C - B))
                System.out.println("Cat A");
            else
                System.out.println("Mouse C");
        }
    }
}
//https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?h_r=next-challenge&h_v=zen