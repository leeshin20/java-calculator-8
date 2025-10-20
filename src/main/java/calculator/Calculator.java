package calculator;

import java.util.ArrayList;

public class Calculator {
    private Integer sum = 0;
    public void sumNumbers(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            this.sum = this.sum + number;
        }
    }

    public Integer getSum() {
        return this.sum;
    }
}
