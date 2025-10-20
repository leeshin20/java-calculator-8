package calculator;

import java.util.ArrayList;

public class Parser {
    private static String separator = ",|:";

    public static ArrayList<Integer> splitBySeparator(String equation) {
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] stringNumbers = equation.split("separator");

        for (String stringNum : stringNumbers) {
            int number = Integer.parseInt(stringNum.trim());
            checkNumberIsPositive(number);
            numbers.add(number);
        }
        return numbers;
    }

    private static void checkNumberIsPositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("음수가 입력되었습니다. 양수만 입력해주세요.");
        }
    }
}
