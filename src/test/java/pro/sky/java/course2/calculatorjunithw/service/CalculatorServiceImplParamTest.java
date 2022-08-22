package pro.sky.java.course2.calculatorjunithw.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static pro.sky.java.course2.calculatorjunithw.service.Constants.*;

public class CalculatorServiceImplParamTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSumCorrectly(int a, int b) {
        int result = calculatorService.add(a, b);
        Assertions.assertEquals(a + b, result);
    }

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSubtractCorrectly(int a, int b) {
        int result = calculatorService.subtract(a, b);
        Assertions.assertEquals(a - b, result);
    }
    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMultiplyCorrectly(int a, int b) {
        int result = calculatorService.multiply(a, b);
        Assertions.assertEquals(a * b, result);
    }
    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldDivideCorrectly(int a, int b) {
        int result = calculatorService.divide(a, b);
        Assertions.assertEquals(a / b, result);
    }

    private static Stream<Arguments> provideCalculatorParams() {
        return Stream.of(
Arguments.of(ONE, TWO),
Arguments.of(TWO, TWO),
Arguments.of(ONE, THREE),
Arguments.of(ZERO, THREE)
        );
    }

}
