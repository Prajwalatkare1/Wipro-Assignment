package JUnit_Questions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class QN1 {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    @Test
    public void testFactorial_ValidInputs() {
        assertEquals(1L, factorial(0));
        assertEquals(1L, factorial(1));
        assertEquals(2L, factorial(2));
        assertEquals(6L, factorial(3));
        assertEquals(24L, factorial(4));
    }

    @Test
    public void testFactorial_NegativeInput_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> factorial(-5));
    }
}
