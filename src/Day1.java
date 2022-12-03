import java.util.ArrayList;

public class Day1 {
    public static void solve() {
        var input = Reader.lines("1");
        var calories = new ArrayList<Integer>();
        calories.add(0);

        for (String line: input) {
            if (!line.isEmpty()) {
                var lastIndex = calories.size() - 1;
                calories.set(lastIndex, calories.get(lastIndex) + Integer.parseInt(line));
            } else {
                calories.add(0);
            }
        }

        calories.sort((a, b) -> b - a);

        var maxCalories = calories.get(0);
        System.out.println(maxCalories);

        var maxThreeCalories = calories.subList(0, 3).stream().reduce(0, Integer::sum);
        System.out.println(maxThreeCalories);
    }
}
