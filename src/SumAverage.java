/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

    /**
     * Computes sum of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return sum of integers
     */
    public static int sum(int lowerBound, int upperBound) {
        int total = 0;
        // Sum integers from lowerBound to upperBound
        for (int i = lowerBound; i <= upperBound; i++) {
            total += i;
        }
        return total;
    }

    /**
     * Computes sum of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return sum of integers
     */
    public static int sum(int[] numbers) {
        int total = 0;
        // Sum integers using for-each loop
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return average of integers
     */
    public static double average(int lowerBound, int upperBound) {
        int total = sum(lowerBound, upperBound);
        int count = upperBound - lowerBound + 1;
        return (double) total / count; // Calculate average
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return average of integers
     */
    public static double average(int[] numbers) {
        int total = 0;
        int count = 0;
        // Calculate sum and count using do-while loop
        int i = 0;
        do {
            total += numbers[i];
            count++;
            i++;
        } while (i < numbers.length);
        return count > 0 ? (double) total / count : 0; // Calculate average if count > 0
    }
}
