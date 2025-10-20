package calculator;

public class Output {
    public static void printMessage() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
    }
    public static void printResult(Calculator calculator) {
        System.out.println("결과 : " + calculator.getSum());
    }
}
