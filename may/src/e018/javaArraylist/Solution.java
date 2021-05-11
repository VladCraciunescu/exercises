package e018.javaArraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d, q, x, y;
        ArrayList[] set = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            d = s.nextInt();
            set[i] = new ArrayList();
            for (int j = 0; j < d; j++) {
                set[i].add(s.nextInt());
            }
        }
        q = s.nextInt();
        for (int i = 1; i <= q; i++) {
            x = s.nextInt();
            y = s.nextInt();
            try {
                System.out.println(set[x - 1].get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
//https://www.hackerrank.com/challenges/java-arraylist/problem