import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc;

    @BeforeEach
    public void setUp(){
        calc = new Calculator();
    }



    @Test
    void divideTwoInts() {
        assertEquals(2, calc.divide(4,2));
    }

    @Test
    void divideDifferent(){
        assertEquals(-3, calc.divide(-9,3));
    }

    @Test
    void divideByZero(){
        assertEquals(0, calc.divide(4,0));
    }
}