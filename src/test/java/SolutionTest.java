import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Grading test file for the U1C2 Programming Challenge.
// This exact file gets copied into every student's cloned repo before
// grading, overwriting whatever they had - so editing this file has no
// effect on a student's grade.
public class SolutionTest {

    // Problem 1: Test Average

    @Test
    public void testProblem1_Average() {
        Solution s = new Solution();
        assertEquals(82.0625, s.average(75, 80.5, 82.75, 90.0), 1e-9);
    }

    @Test
    public void testProblem1_RoundAverage() {
        Solution s = new Solution();
        assertEquals(90, s.roundAverage(89.7));
    }

    @Test
    public void testProblem1_IsPassing() {
        Solution s = new Solution();
        assertTrue(s.isPassing(65));
    }

    // Problem 2: Stock Value Change

    @Test
    public void testProblem2_TotalStock() {
        Solution s = new Solution();
        assertEquals(-14.8, s.totalStock(40, -0.37), 1e-9);
    }

    @Test
    public void testProblem2_RoundValueChangePositive() {
        Solution s = new Solution();
        assertEquals(26, s.roundValueChange(25.6));
    }

    @Test
    public void testProblem2_RoundValueChangeNegative() {
        // (int)(x + 0.5) gives -14 here, which is wrong.
        Solution s = new Solution();
        assertEquals(-15, s.roundValueChange(-14.8));
    }

    // Problem 3: Adjusted Digits

    @Test
    public void testProblem3_AdjustDigits() {
        Solution s = new Solution();
        assertEquals(234.01, s.adjustDigits(123.90), 1e-9);
    }

    @Test
    public void testProblem3_AdjustDigitsWrapsNine() {
        // The 9 must wrap to 0 without carrying into the 8, so just
        // adding 11.11 (which gives 57.00) fails.
        Solution s = new Solution();
        assertEquals(560.90, s.adjustDigits(459.89), 1e-9);
    }
}
