package calculator;

import java.util.ArrayList;

public class Parser {
    private static String separator = ",|:";

    public static ArrayList<Integer> splitBySeparator(String equation) {
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] stringNumbers = equation.split("separator");

        for (String stringNum : stringNumbers) {
            int number = Integer.parseInt(stringNum.trim());
            numbers.add(number);
        }
        return numbers;
    }
}
