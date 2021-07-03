package e017.pickingNumbers;

import java.rmi.MarshalException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int maxlenght = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        List<Integer> subarr = new ArrayList<>();
        for (int j = 0; j < n - 1; j++) {
            subarr.clear();
            subarr.add(arr[j]);
            for (int l = j + 1; l < n; l++) {
                if (arr[j] == arr[l] || Math.abs((arr[j] - arr[l])) == 1)
                    subarr.add(arr[l]);
            }

            if (subarr.size() > maxlenght)
                maxlenght = subarr.size();

        }
        System.out.println(maxlenght);
    }
}
//https://www.hackerrank.com/challenges/picking-numbers/problem