package calculator;

import java.util.ArrayList;

public class Parser {
    private static String separator = ",|:";

    public static ArrayList<Integer> splitBySeparator(String equation) {
        if (equation.length() > 4) {
            equation = checkCustomSeparator(equation);
        }
        ArrayList<Integer> numbers = new ArrayList<>();

        if (equation.isEmpty()) {
            return numbers;
        }
        String[] stringNumbers = equation.split(separator);

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
        return numbers;
    }

    private static void checkNumberIsPositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("음수가 입력되었습니다. 양수만 입력해주세요.");
        }
    }

    private static String checkCustomSeparator(String equation) {
        String customSeparateString = equation.substring(0,5);
        if (customSeparateString.startsWith("//") && customSeparateString.endsWith("\\n")) {
            addCustomSeparator(equation.substring(0,5));
            return equation.substring(5);
        }
        return equation;
    }

    private static void addCustomSeparator(String customSeparatorString) {
        separator = separator + "|" + customSeparatorString.charAt(2);
    }
}
