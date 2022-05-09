package tasks.four;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractCalculator implements Calculator {
    protected final Logger logger = Logger.getLogger(AbstractCalculator.class.getName());
    protected Double numberOne = null;
    protected Double numberTwo = null;
    protected Operation operation = null;
    protected Double result = null;
    protected static String MSG = "Операция еще не выполнялась";

    public Double doCalculations(Double numberOne, Double numberTwo, Operation operation) {
        logger.log(Level.INFO, "Выполняем вычисления {0} {1} {2}", new Object[]{numberOne, operation.getOperation(), numberTwo});
        double result;
        switch (operation.getOperation()) {
            case "+" -> result = numberOne + numberTwo;
            case "-" -> result = numberOne - numberTwo;
            case "*" -> result = numberOne * numberTwo;
            case "/" -> {
                result = numberOne / numberTwo;
                if (numberTwo == 0)
                    throw new ArithmeticException("Деление на ноль запрещено!");
            }
            default -> throw new IllegalArgumentException("Ошибка! Вы ввели некорректную операцию");
        }
        this.result = result;
        return result;
    }

    protected Double getNumberOne() {
        if (numberOne == null)
            System.out.println(MSG);
        return numberOne;
    }

    protected Double getNumberTwo() {
        if (numberTwo == null)
            System.out.println(MSG);
        return numberTwo;
    }

    public Operation getOperation() {
        if (operation == null)
            System.out.println(MSG);
        return operation;
    }

}
