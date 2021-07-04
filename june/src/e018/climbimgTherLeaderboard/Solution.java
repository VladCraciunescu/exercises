package e018.climbimgTherLeaderboard;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        Set<Integer> set = new LinkedHashSet<Integer>();

        for (Integer i : ranked) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        List<Integer> res = new LinkedList<>();
        int rank = list.size() + 1;
        for (Integer i : player) {
            for (int j = rank - 2; j >= 0; j--) {
                if (i < list.get(j)) break;
                else if (i == list.get(j)) {
                    rank--;
                    break;
                } else rank--;
            }
            res.add(rank);
        }
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.climbingLeaderboard(ranked, player);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
//https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem