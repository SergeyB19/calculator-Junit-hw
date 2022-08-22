package pro.sky.java.course2.calculatorjunithw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculatorjunithw.exception.DivisionByZeroException;
import pro.sky.java.course2.calculatorjunithw.service.CalculatorService;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/plus")
    public String addNumbers(@RequestParam int a, @RequestParam int b) {
        return generateMessage(a,b,"+", calculatorService.add(a,b));
    }

    @GetMapping("/minus")
    public String subTractNumbers(@RequestParam int a, @RequestParam int b) {
        return generateMessage(a,b,"-", calculatorService.subtract(a,b));
    }

    @GetMapping("/multiply")
    public String multiplyNumbers(@RequestParam int a, @RequestParam int b) {
        return generateMessage(a,b,"*", calculatorService.multiply(a,b));
    }

    @GetMapping("/divide")
    public String divideNumbers(@RequestParam int a, @RequestParam int b) {

        return generateMessage(a,b,"/", calculatorService.divide(a,b));
    }

    private String generateMessage(int a, int b, String operation, int result) {
        return String.format("%d %s %d", a, operation, b, result);
    }
}
