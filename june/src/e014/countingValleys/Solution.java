package e014.countingValleys;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int v = 0;
        int lvl = 0;
        for(char c : s.toCharArray()){
            if(c == 'U') ++lvl;
            if(c == 'D') --lvl;
            if(lvl == 0 && c == 'U')
                v++;
        }
        System.out.print(v);
    }
}
//https://www.hackerrank.com/challenges/counting-valleys/problem