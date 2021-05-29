package e050.funnyString;

import java.io.*;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
        char[] s1 = new StringBuilder(s).reverse().toString().toCharArray();

        int ok = 1;
        int d1, d2;
        char[] ar1 = s.toCharArray();
        char[] ar2 = new StringBuilder(s).reverse().toString().toCharArray();
        for (int i = 1; i < s.length(); i++) {
            if (Math.abs((int) ar1[i] - (int) ar1[i - 1]) != Math.abs((int) ar2[i] - (int) ar2[i - 1])) {
                return "Not Funny";
            }
        }
        return "Funny";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.funnyString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
//https://www.hackerrank.com/challenges/funny-string/problem
