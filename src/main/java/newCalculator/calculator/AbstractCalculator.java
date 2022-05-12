package newCalculator.calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractCalculator implements Calculator {
    protected final Logger logger = Logger.getLogger(AbstractCalculator.class.getName());
    protected Double numberOne = null;
    protected Double numberTwo = null;
    protected Operation operation = null;
    protected Double result = null;
    protected static String MSG = "Операция еще не выполнялась. Выполните операцию";

    public Double doCalculations(Double numberOne, Double numberTwo, Operation operation) throws IllegalArgumentException, ArithmeticException {
        logger.log(Level.INFO, "Выполняем вычисления {0} {1} {2}", new Object[]{numberOne, operation.getOperation(), numberTwo});
        Double result = null;
        switch (operation.getOperation()) {
            case "+" -> result = numberOne + numberTwo;
            case "-" -> result = numberOne - numberTwo;
            case "*" -> result = numberOne * numberTwo;
            case "/" -> {
                result = numberOne / numberTwo;
                if (numberTwo == 0)
                    throw new ArithmeticException();
            }
            default -> throw new IllegalArgumentException();
        }
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.operation = operation;
        this.result = result;
        return result;
    }

    public Double getNumberOne() {
        if (numberOne == null)
            System.out.println(MSG);
        return numberOne;
    }

    public Double getNumberTwo() {
        if (numberTwo == null)
            System.out.println(MSG);
        return numberTwo;
    }

    public Operation getOperation() {
        if (operation == null)
            System.out.println(MSG);
        return operation;
    }

    public Double getResult() {
        return result;
    }
}
