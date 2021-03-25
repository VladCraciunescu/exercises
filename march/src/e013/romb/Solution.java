package e013.romb;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nr,i,x,k1,k2,d;
        nr=s.nextInt();
        x=1;
        for(i=1; i<=nr; i++)
        {
            k1=1;
            d=nr-i;
            while(k1<=d)
            {
                System.out.print(" ");
                k1++;
            }
            for(k2=1;k2<=x;k2++)
            {
                System.out.print(i);
            }
            System.out.println();
            x=x+2;


        }
        x=x-4;
        for(i=nr-1; 0<i; i--)
        {
            k1=1;
            d=nr-i;
            while(k1<=d)
            {
                System.out.print(" ");
                k1++;
            }
            for(k2=1;k2<=x;k2++)
            {
                System.out.print(i);
            }
            System.out.println();
            x=x-2;


        }
    }
}
//https://www.pbinfo.ro/probleme/1393/desenromb