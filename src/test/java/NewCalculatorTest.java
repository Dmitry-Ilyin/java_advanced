import newCalculator.calculator.MyCalculator;
import newCalculator.calculator.Operation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NewCalculatorTest {
    private static MyCalculator myCalculator;
    private Double numberOne = 5.0;
    private Double numberTwo = 2.0;

    @BeforeAll
    static void setUp() {
        myCalculator = MyCalculator.getInstance();
    }

    @Test
    void verificationsOfCalculations() {
        Assertions.assertAll(
                () -> assertEquals(numberOne + numberTwo, myCalculator.doCalculations(numberOne, numberTwo, Operation.ADD), "Некорректная операция сложения"),
                () -> assertEquals(numberOne * numberTwo, myCalculator.doCalculations(numberOne, numberTwo, Operation.MULTIPLY), "Некорректная операция умножения"),
                () -> assertEquals(numberOne - numberTwo, myCalculator.doCalculations(numberOne, numberTwo, Operation.SUBTRACT), "Некорректная операция вычитания"),
                () -> assertEquals(numberOne / numberTwo, myCalculator.doCalculations(numberOne, numberTwo, Operation.DIVIDE), "Некорректная операция деления")
        );
    }

    @Test
    void checkingForExceptions() {
        Assertions.assertAll(
                () -> assertThrows(ArithmeticException.class, () -> myCalculator.doCalculations(numberOne, 0.0, Operation.DIVIDE)),
                () -> assertThrows(IllegalArgumentException.class, () -> myCalculator.doCalculations(numberOne, numberTwo, Operation.valueOf(".")))
        );
    }
}
