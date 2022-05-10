package newCalculator.utils;

import newCalculator.calculator.Operation;

import java.util.Arrays;

public class CalcluatorDataParser {

    private CalcluatorDataParser() {
    }

    public static Double parseDouble(String number) {
        Double value = null;
        try {
            value = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка! Вы ввели не число");
        }
        return value;
    }

    public static Operation parseSign(String sign) {
        Operation operation = null;
        Operation[] arrayOperation = Operation.values();
        try {
            operation = Arrays.stream(arrayOperation).filter(i -> i.getOperation().equals(sign)).findFirst().orElseThrow(IllegalArgumentException::new);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка! Вы ввели некорректный знак");
        }
        return operation;
    }
}
