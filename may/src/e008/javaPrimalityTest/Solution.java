package e008.javaPrimalityTest;

import java.util.Scanner;
import java.math.*;

public class Solution {

    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        }
    }

}
//https://www.hackerrank.com/challenges/java-primality-test/problem