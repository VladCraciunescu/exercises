package e003.gradingStudents;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int grade;
        for (int i = 1; i <= n; i++) {
            grade = s.nextInt();
            int compare = 5 * (grade / 5 + 1);
            if (compare < 40 || compare - grade >= 3)
                System.out.println(grade);
            else
                System.out.println(compare);

        }
    }
}
//https://www.hackerrank.com/challenges/grading/problem