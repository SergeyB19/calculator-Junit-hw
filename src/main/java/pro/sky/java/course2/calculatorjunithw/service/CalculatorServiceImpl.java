package pro.sky.java.course2.calculatorjunithw.service;

import pro.sky.java.course2.calculatorjunithw.exception.DivisionByZeroException;

public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public int subtract(int a, int b) {
        return 0;
    }

    @Override
    public int multiply(int a, int b) {
        return 0;
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}
