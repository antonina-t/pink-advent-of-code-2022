import java.util.HashMap;

public class Day2 {
    public static void part1() {
        var input = Reader.lines("2");

        var score = new HashMap<String, Integer>();
        score.put("A X", 1 + 3);
        score.put("A Y", 2 + 6);
        score.put("A Z", 3 + 0);
        score.put("B X", 1 + 0);
        score.put("B Y", 2 + 3);
        score.put("B Z", 3 + 6);
        score.put("C X", 1 + 6);
        score.put("C Y", 2 + 0);
        score.put("C Z", 3 + 3);

        var totalScore = input.stream().map(score::get).reduce(0, Integer::sum);
        System.out.println(totalScore);
    }

    public static void part2() {
        var input = Reader.lines("2");

        var score = new HashMap<String, Integer>();
        score.put("A X", 0 + 3);
        score.put("A Y", 3 + 1);
        score.put("A Z", 6 + 2);
        score.put("B X", 0 + 1);
        score.put("B Y", 3 + 2);
        score.put("B Z", 6 + 3);
        score.put("C X", 0 + 2);
        score.put("C Y", 3 + 3);
        score.put("C Z", 6 + 1);

        var totalScore = input.stream().map(score::get).reduce(0, Integer::sum);
        System.out.println(totalScore);
    }
}
