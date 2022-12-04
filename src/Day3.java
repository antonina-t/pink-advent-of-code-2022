import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Day3 {
    public static void part1() {
        var input = Reader.lines("3");

        var result = input.stream()
                .map(Day3::getCommonElement)
                .map(Day3::getPrio)
                .reduce(Integer::sum)
                .orElseThrow();

        System.out.println(result);
    }

    public static void part2() {
        var input = Reader.lines("3");

        var sum = 0;
        for (int i = 0; i < input.size(); i += 3) {
            var first = input.get(i);
            var second = input.get(i + 1);
            var third = input.get(i + 2);

            var firstSet = toSet(first);
            var secondSet = toSet(second);
            var thirdSet = toSet(third);

            firstSet.retainAll(secondSet);
            firstSet.retainAll(thirdSet);

            sum += getPrio(firstSet.iterator().next());
        }

        System.out.println(sum);
    }

    static char getCommonElement(String input) {
        var left = input.substring(0, input.length() / 2);
        var right = input.substring(input.length() / 2);

        var leftSet = toSet(left);
        var rightSet = toSet(right);

        leftSet.retainAll(rightSet);

        return leftSet.iterator().next();
    }

    static Set<Character> toSet(String input) {
        var set = new HashSet<Character>();
        for (char c : input.toCharArray()) {
            set.add(c);
        }
        return set;
    }

    static int getPrio(char c) {
        if (Character.isLowerCase(c))
            return c - 'a' + 1;
        else
            return c - 'A' + 27;
    }
}
