package newCalculator.utils;

import newCalculator.calculator.InputNumber;
import newCalculator.calculator.Operation;

import java.io.BufferedReader;
import java.io.IOException;

public class CalculatorInputData {

    private CalculatorInputData() {
    }

    public static Double inputNumber(BufferedReader reader, InputNumber inputNumber) {
        Double number = null;
        while (number == null) {
            System.out.print("Введите " + inputNumber.getValue() + " число : ");
            try {
                number = CalcluatorDataParser.parseDouble(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return number;
    }

    public static Operation inputSign(BufferedReader reader) {
        Operation operation = null;
        while (operation == null) {
            System.out.print("Введите знак операции ('+', '-', '*', '/')  : ");
            try {
                operation = CalcluatorDataParser.parseSign(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return operation;
    }
}
