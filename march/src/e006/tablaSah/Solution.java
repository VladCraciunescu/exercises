package e006.tablaSah;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int[][] tabla = new int[8][8];
        String x = s1.next();
        int y = s1.nextInt();
        while (x.length() > 1) {
            System.out.println("invalid value");
            x = s1.next();
        }
        while (y > 8) {
            System.out.println("invalid value");
            y = s1.nextInt();
        }
        int x1;
        switch (x.toLowerCase()) {
            case "a":
                x1 = 1;
                break;
            case "b":
                x1 = 2;
                break;
            case "c":
                x1 = 3;
                break;
            case "d":
                x1 = 4;
                break;
            case "e":
                x1 = 5;
                break;
            case "f":
                x1 = 6;
                break;
            case "g":
                x1 = 7;
                break;
            case "h":
                x1 = 8;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + x.toLowerCase());
        }
        int res1 = (x1 - 1) * 8 + y - 1;
        long res = up(2, res1);
        if (x.equals("a") && y == 1)
            System.out.println("la patratul " + x + y + " se afla " + 1 + " boabe de grau");
        else if(res>0)
            System.out.println("la patratul " + x + y + " se afla " + res + " boabe de grau");


    }

    public static long up(int x, int y) {
        long z = x;
        for (int i = 1; i < y; i++) {
            z = z * x;
        }
        return z;
    }
}
//pe o tabla de sah se aseaza incepand din coltul a1 un bob de grau in primul patrat in urmatorul dublu si tot asa.sa se
// afle numarul boabelor de pe un patrat dat.