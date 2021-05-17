package e034.javaExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y;
        try {
            x = s.nextInt();
            y = s.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException e) {

            System.out.println("java.util.InputMismatchException");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
//https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem