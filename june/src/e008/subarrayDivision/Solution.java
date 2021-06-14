package e008.subarrayDivision;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {


    static int birthday(List<Integer> s, int d, int m) {
        int length = s.size();
        int numWays = 0, sum = 0;

        for(int i = 0 ; i <= (length - m) ; i++){
            for(int j = 0 ; j < m ; j++){
                sum = sum + s.get(j+i);
            }
            if(sum == d){
                numWays++;
            }
            sum = 0;
        }
        return numWays;
    }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int d = Integer.parseInt(firstMultipleInput[0]);

            int m = Integer.parseInt(firstMultipleInput[1]);

            int result = Result.birthday(s, d, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
//https://www.hackerrank.com/challenges/the-birthday-bar/problem