package e020.javaList;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int value = s.nextInt();
            list.add(value);
        }
        int Q = s.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = s.next();
            if (action.equals("Insert")) {
                int index = s.nextInt();
                int value = s.nextInt();
                list.add(index, value);
            } else {
                int index = s.nextInt();
                list.remove(index);
            }
        }
        s.close();
        for (Integer num : list)
            System.out.print(num + " ");
    }
}
//https://www.hackerrank.com/challenges/java-list/problem