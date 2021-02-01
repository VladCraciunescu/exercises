package e015.stringToInt;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        S =S.toLowerCase();
        try{
            System.out.println(Integer.parseInt(S));
        }catch (NumberFormatException ex){
            System.out.println("Bad String");
        }
    }
}
//https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem