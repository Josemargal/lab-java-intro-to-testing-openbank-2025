public class NumberUtils {

    /**
     * Returns an array containing all odd integers from 1 to n.
     *
     * @param n the upper limit
     * @return array of odd integers from 1 to n
     */
    public static int[] getOddNumbers(int n) {
        if (n <= 0) {
            return new int[]{};
        }

        int count = (n + 1) / 2;
        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = 2 * i + 1;
        }

        return result;
    }
}