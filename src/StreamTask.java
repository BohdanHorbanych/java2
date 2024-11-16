import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        // Filter even numbers, square them, and sum the squares using Stream API.
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        // Filter odd numbers, sort them, and collect into an array using Stream API.
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .sorted()
                .toArray();
    }
}
