import java.util.HashSet;

public class Day3 {
    public static void part1() {
        var input = Reader.lines("3");
        var result = input.stream()
                .map(Day3::getItem)
                .map(Day3::getPrio)
                .reduce(Integer::sum)
                .orElseThrow();
        System.out.println(result);
    }

    public static void part2() {
        var input = Reader.lines("3");
        var sum = 0;
        for (int i = 0; i < input.size(); i += 3) {
            var first = toSet(input.get(i));
            var second = toSet(input.get(i + 1));
            var third = toSet(input.get(i + 2));

            first.retainAll(second);
            first.retainAll(third);
            sum += getPrio(first.iterator().next());
        }
        System.out.println(sum);
    }


    private static HashSet<Character> toSet(String s) {
        var set = new HashSet<Character>();
        for (char c : s.toCharArray())
            set.add(c);
        return set;
    }

    private static char getItem(String rucksack) {
        var left = toSet(rucksack.substring(0, rucksack.length() / 2));
        var right = toSet(rucksack.substring(rucksack.length() / 2));
        left.retainAll(right);
        return left.iterator().next();
    }

    private static int getPrio(char c) {
        if (Character.isLowerCase(c))
            return c - 'a' + 1;
        else
            return c - 'A' + 27;
    }
}
