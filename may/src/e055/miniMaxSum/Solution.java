package e055.miniMaxSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long min, max, sum = 0;
        min = in.nextLong();
        max = min;
        sum = min;
        for (int i = 0; i < 4; i++) {
            long a = in.nextLong();
            sum += a;
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }
        System.out.print((sum - max) + " " + (sum - min));
    }
}

//https://www.hackerrank.com/challenges/mini-max-sum/problem