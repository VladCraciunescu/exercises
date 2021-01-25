package e007.dictionariesAndMas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> m1 = new HashMap<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            m1.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (m1.containsKey(s)) {
                System.out.println(s + "=" + m1.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
//  https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem