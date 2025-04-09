import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {

    @Test
    public void testGetOddNumbers_WithNegativeNumber() {
        int[] result = NumberUtils.getOddNumbers(-5);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void testGetOddNumbers_WithZero() {
        int[] result = NumberUtils.getOddNumbers(0);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void testGetOddNumbers_WithOne() {
        int[] result = NumberUtils.getOddNumbers(1);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void testGetOddNumbers_WithTen() {
        int[] result = NumberUtils.getOddNumbers(10);
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, result);
    }

    @Test
    public void testGetOddNumbers_WithEleven() {
        int[] result = NumberUtils.getOddNumbers(11);
        assertArrayEquals(new int[]{1, 3, 5, 7, 9, 11}, result);
    }
}
