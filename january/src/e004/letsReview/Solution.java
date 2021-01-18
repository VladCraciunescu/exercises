package e004.letsReview;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String S = "";
        String s1 = "";
        String s2 = "";
        int j = 0;
        s.nextLine();
        S = s.nextLine();
        while (j < t) {
            for (int i = 0; i < S.length(); i++) {
                if (i % 2 == 0) {
                    s1 = s1 + S.charAt(i);
                } else {
                    s2 = s2 + S.charAt(i);
                }
            }
            System.out.println(s1 + " " + s2);
            s1 = "";
            s2 = "";
            j = j + 1;
            if (j < t) {
                S = s.nextLine();
            }
        }
    }


}
