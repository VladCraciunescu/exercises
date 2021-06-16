package e010.migratoryBirds;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        Map<Integer,Integer> birds = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            if(birds.containsKey(arr[i])){
                birds.put(arr[i], birds.get(arr[i]) + 1);
            }else{
                birds.put(arr[i], 1);
            }
        }
        int key = Collections.max(birds.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(key);
    }
}

//https://www.hackerrank.com/challenges/migratory-birds/problem?h_r=next-challenge&h_v=zen