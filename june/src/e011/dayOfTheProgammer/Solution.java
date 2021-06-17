package e011.dayOfTheProgammer;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if (year < 1918) {
            System.out.println(year % 4 == 0 ? "12.09." + year : "13.09." + year);
        } else if (year == 1918) {
            System.out.println("26.09." + year);
        } else {
            System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "12.09." + year : "13.09." + year);
        }
    }
}

//https://www.hackerrank.com/challenges/day-of-the-programmer/problem