package calculator;

import java.util.ArrayList;

public class CalculatorController {
    public static void runCalculator() {
        Calculator calculator = new Calculator();
        Output.printMessage();
        ArrayList<Integer> numbers = Parser.splitBySeparator(Input.inputEquation());
        calculator.sumNumbers(numbers);
        Output.printResult(calculator);
    }
}
