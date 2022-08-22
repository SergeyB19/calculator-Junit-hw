package pro.sky.java.course2.calculatorjunithw.service;

import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculatorjunithw.exception.DivisionByZeroException;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculatorjunithw.service.Constants.*;

class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldReturnTwoWhenSumOneAndOne() {
        int result = calculatorService.add(ONE, ONE);
        assertEquals(ONE+ONE, result);
    }

    @Test
    public void shouldReturnThreeWhenSumTwoAndOne() {
        int result = calculatorService.add(TWO, ONE);
        assertEquals(TWO+ONE, result);
    }

    @Test
    public void shouldReturnOneWhenSubtractTwoAndOne() {
        int result = calculatorService.add(TWO, ONE);
        assertEquals(TWO-ONE, result);
    }
    @Test
    public void shouldReturnZeroWhenSubtractOneAndOne() {
        int result = calculatorService.add(ONE, ONE);
        assertEquals(ONE-ONE, result);
    }

    @Test
    public void shouldReturnTwoWhenMultiplyOneAndTwo() {
        int result = calculatorService.add(ONE, TWO);
        assertEquals(ONE*TWO, result);
    }

    @Test
    public void shouldReturnOneWhenMultiplyOneAndTwo() {
        int result = calculatorService.add(ONE, ONE);
        assertEquals(ONE*ONE, result);
    }

    @Test
    public void shouldReturnTwoWhenDivideTwoAndOne() {
        int result = calculatorService.add(TWO, ONE);
        assertEquals(TWO/ONE, result);
    }

    @Test
    public void shouldReturnOneWhenDivideOneAndOne() {
        int result = calculatorService.add(ONE, ONE);
        assertEquals(ONE/ONE, result);
    }

    @Test
    public void shouldThrowDivisionByZeroExceptionWhenDivideByZero() {
        assertThrows(DivisionByZeroException.class,() ->calculatorService.divide(ONE, ZERO));
    }
}