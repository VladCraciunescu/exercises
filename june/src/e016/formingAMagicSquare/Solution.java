package e016.formingAMagicSquare;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] sq = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sq[i][j] = s.nextInt();
            }
        }
        int cost = Integer.MAX_VALUE;
        int t[][] =
                {
                        {4,9,2,3,5,7,8,1,6},
                        {4,3,8,9,5,1,2,7,6},
                        {2,9,4,7,5,3,6,1,8},
                        {2,7,6,9,5,1,4,3,8},
                        {8,1,6,3,5,7,4,9,2},
                        {8,3,4,1,5,9,6,7,2},
                        {6,7,2,1,5,9,8,3,4},
                        {6,1,8,7,5,3,2,9,4},
                };
        int temp = 0;
        for(int i=0;i<8;i++){
            temp = Math.abs(sq[0][0]-t[i][0]) + Math.abs(sq[0][1]-t[i][1]) +Math.abs(sq[0][2]-t[i][2]) +Math.abs(sq[1][0]-t[i][3]) + Math.abs(sq[1][1]-t[i][4]) + Math.abs(sq[1][2]-t[i][5])+ Math.abs(sq[2][0]-t[i][6]) + Math.abs(sq[2][1]-t[i][7]) + Math.abs(sq[2][2]-t[i][8]);
            cost = temp<cost?temp:cost;
        }
        System.out.println(cost);

    }
}
//https://www.hackerrank.com/challenges/magic-square-forming/problem?h_r=next-challenge&h_v=zen
