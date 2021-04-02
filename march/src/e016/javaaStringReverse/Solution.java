package e016.javaaStringReverse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );

    }
}
//https://www.hackerrank.com/challenges/java-string-reverse/problem?h_r=next-challenge&h_v=zen