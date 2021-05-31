package e053.plusMinus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {
        int kplus = 0, kminus = 0, k0 = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0)
                kplus++;
            else if (arr.get(i) < 0)
                kminus++;
            else
                k0++;

        }
        System.out.println((double) kplus / arr.size());
        System.out.println((double) kminus / arr.size());
        System.out.println((double) k0 / arr.size());

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
//https://www.hackerrank.com/challenges/plus-minus/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen