package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {
    private StringCalculator cal;

    @BeforeEach
    public void setup() {
        cal = new StringCalculator();
    }

    @Test
    public void add_null_or_empty() {
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    @Test
    public void add_one_number(){
        assertEquals(1, cal.add("1"));
    }

    @Test
    public void add_blank_delimiter() {
        assertEquals(3, cal.add("1 2"));
    }

    @Test
    public void add_negative() {
        assertThrows(RuntimeException.class, () -> {
            cal.add("-1 2 3");
        });
    }
}
