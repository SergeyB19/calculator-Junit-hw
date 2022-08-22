package pro.sky.java.course2.calculatorjunithw.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {
    int add(int a, int b);

    int subtract(int a, int b);

    int multiply(int a, int b);

    int divide(int a, int b);


}
