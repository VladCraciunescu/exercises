package e005.sortPart2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    static void insertionSort2(int n, int[] ar) {
        for( int i = 1; i<ar.length; i++)
        {
            int unsorted = ar[i];
            for( int j = i-1;j>=0; j-- )
            {
                if(unsorted< ar[j])
                    ar[j+1] = ar[j];
                else if (ar[j] <= unsorted)
                {
                    ar[j+1] = unsorted;
                    break;
                }
                if( j == 0 && unsorted<ar[0])
                    ar[0] = unsorted;
            }
            printArray(ar);

        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
