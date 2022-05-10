package newCalculator;

import newCalculator.calculator.MyCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            MyCalculator myCalculator = MyCalculator.getInstance();
            myCalculator.getInputDataAndDoCalculations(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
