package newCalculator.calculator;

public interface Calculator {
    Double doCalculations(Double numberOne, Double numberTwo, Operation op);

    void printResult();
}
