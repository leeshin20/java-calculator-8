package calculator;

import java.util.ArrayList;

public class Parser {
    private static String separator = ",|:";

    public static ArrayList<Integer> splitBySeparator(String equation) {
        equation = checkCustomSeparator(equation);
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] stringNumbers = equation.split("separator");

        for (String stringNum : stringNumbers) {
            int number;
            try {
                number = Integer.parseInt(stringNum);
            } catch (NumberFormatException e){
                throw new IllegalArgumentException("구분자 외의 잘못된 문자가 입력되었습니다.");
            }
            checkNumberIsPositive(number);
            numbers.add(number);
        }
        checkNumbersIsEmpty(numbers);
        return numbers;
    }

    private static void checkNumberIsPositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("음수가 입력되었습니다. 양수만 입력해주세요.");
        }
    }

    private static String checkCustomSeparator(String equation) {
        String customSeparateString = equation.substring(0,4);
        if (customSeparateString.startsWith("//") && customSeparateString.endsWith("\n")) {
            addCustomSeparator(equation.substring(0,4));
            return equation.substring(4);
        }
        return equation;
    }

    private static void addCustomSeparator(String customSeparatorString) {
        separator = separator + "|" + customSeparatorString.charAt(2);
    }

    private static void checkNumbersIsEmpty(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("숫자가 입력되지 않았습니다. 계산을 위해 숫자(양수)와 구분자를 입력해주세요.");
        }
    }
}
