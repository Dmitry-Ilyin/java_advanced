package newCalculator;

import newCalculator.calculator.InputNumber;
import newCalculator.calculator.MyCalculator;
import newCalculator.calculator.Operation;
import newCalculator.utils.CalculatorInputData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            MyCalculator myCalculator = new MyCalculator();
            while (myCalculator.getResult() == null) {
                Double numberOne = CalculatorInputData.inputNumber(reader, InputNumber.FIRST);
                Double numberTwo = CalculatorInputData.inputNumber(reader, InputNumber.SECOND);
                Operation operation = CalculatorInputData.inputSign(reader);
                try {
                    myCalculator.doCalculations(numberOne, numberTwo, operation);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка! Вы ввели некорректный знак");
                } catch (ArithmeticException e) {
                    System.out.println("Деление на ноль запрещено");
                }
            }
            myCalculator.printResult();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
