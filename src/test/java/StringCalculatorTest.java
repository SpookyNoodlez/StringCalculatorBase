import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    void testAddOnEmptyReturnsZero(){
        assertEquals(0, new StringCalculator().Add(""));
    }
}
