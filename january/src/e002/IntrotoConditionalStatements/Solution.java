package e002.IntrotoConditionalStatements;

import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 == 1) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && 2 < N && N < 5) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && 6 < N && N <= 20) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && 20 < N) {
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}
