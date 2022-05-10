package newCalculator.calculator;

import newCalculator.utils.CalculatorInputData;
import java.io.BufferedReader;

public class MyCalculator extends AbstractCalculator {
    private static MyCalculator myCalculator;


    @Override
    public void printResult() {
        System.out.println(result == null ? MSG : "Получаем результат : " + result);
    }

    public static MyCalculator getInstance() {
        if (myCalculator == null) {
            myCalculator = new MyCalculator();
        }
        return myCalculator;
    }

    public void getInputDataAndDoCalculations(BufferedReader reader) {
        Double numberOne = CalculatorInputData.inputNumber(reader, InputNumber.FIRST);
        Double numberTwo = CalculatorInputData.inputNumber(reader, InputNumber.SECOND);
        Operation operation = CalculatorInputData.inputSign(reader);
        doCalculations(numberOne, numberTwo, operation);
        printResult();
    }
}
