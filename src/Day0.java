public class Day0 {
    public static void part1() {
        var input = Reader.lines("0");
        var sum = 0;
        for (String number : input) {
            sum += Integer.parseInt(number);
        }
        System.out.println("The sum of numbers in 0.txt is: " + sum);
    }

    public static void part2() {
        var input = Reader.lines("0");
        var product = 1;
        for (String number : input) {
            product *= Integer.parseInt(number);
        }
        System.out.println("The product of numbers in 0.txt is: " + product);
    }
}
