package e002.powersGame;

import java.io.*;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder s = new StringBuilder();
        while (t-- > 0) {
            int n = in.nextInt();
            s.append(n % 8 == 0 ? "Second\n" : "First\n");
        }
        System.out.println(s);
    }
}
//https://www.hackerrank.com/challenges/powers-game-1/problem?h_r=next-challenge&h_v=zen