package e039.javaPrimeChecker;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

class Prime {
    void checkPrime(int... args) {
        for (int num : args) {
            if (isPrime(num) == 1) {
                System.out.print(num + " ");

            }

        }
        System.out.println();

    }

    int isPrime(int n) {
        int ok = 1;
        if (n < 2)
            ok=0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                ok=0;
            }
        }
        return ok;
    }
}

public class Solution {


    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

//https://www.hackerrank.com/challenges/prime-checker/problem