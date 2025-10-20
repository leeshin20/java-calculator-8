package calculator;

import java.util.ArrayList;

public class Calculator {
    public static Integer sumNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }

        return sum;
    }
}
