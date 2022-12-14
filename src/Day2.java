import java.util.HashMap;

public class Day2 {
    public static void part1() {
        var input = Reader.lines("2");

        var map = new HashMap<String, Integer>();
        map.put("A X", 1 + 3);
        map.put("A Y", 2 + 6);
        map.put("A Z", 3 + 0);
        map.put("B X", 1 + 0);
        map.put("B Y", 2 + 3);
        map.put("B Z", 3 + 6);
        map.put("C X", 1 + 6);
        map.put("C Y", 2 + 0);
        map.put("C Z", 3 + 3);

        var result = input.stream().map(map::get).reduce(Integer::sum).orElseThrow();
        System.out.println(result);
    }

    public static void part2() {
        var input = Reader.lines("2");

        var map = new HashMap<String, Integer>();
        map.put("A X", 0 + 3);
        map.put("A Y", 3 + 1);
        map.put("A Z", 6 + 2);
        map.put("B X", 0 + 1);
        map.put("B Y", 3 + 2);
        map.put("B Z", 6 + 3);
        map.put("C X", 0 + 2);
        map.put("C Y", 3 + 3);
        map.put("C Z", 6 + 1);

        var result = input.stream().map(map::get).reduce(Integer::sum).orElseThrow();
        System.out.println(result);
    }
}
