import java.util.ArrayList;

public class Day1 {
    public static void solve() {
        var input = Reader.lines("1");

        var calories = new ArrayList<Integer>();
        calories.add(0);

        for(String line: input) {
            if (line.isEmpty()) {
                calories.add(0);
            } else {
                int value = Integer.parseInt(line);
                calories.set(calories.size() - 1, calories.get(calories.size() - 1) + value);
            }
        }

        var result = calories.stream().max(Integer::compareTo).orElseThrow();
        System.out.println(result);
    }
}
