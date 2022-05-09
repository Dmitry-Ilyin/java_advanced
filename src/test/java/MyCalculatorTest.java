import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tasks.four.MyCaluclator;
import tasks.four.Operation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MyCalculatorTest {
    private static MyCaluclator myCaluclator;
    private Double numberOne = 5.0;
    private Double numberTwo = 2.0;

    @BeforeAll
    static void setUp() {
        myCaluclator = new MyCaluclator();
    }

    @Test
    void verificationsOfCalculations() {
        Assertions.assertAll(
                () -> assertEquals(numberOne + numberTwo, myCaluclator.doCalculations(numberOne, numberTwo, Operation.ADD), "Некорректная операция сложения"),
                () -> assertEquals(numberOne * numberTwo, myCaluclator.doCalculations(numberOne, numberTwo, Operation.MULTIPLY), "Некорректная операция умножения"),
                () -> assertEquals(numberOne - numberTwo, myCaluclator.doCalculations(numberOne, numberTwo, Operation.SUBTRACT), "Некорректная операция вычитания"),
                () -> assertEquals(numberOne / numberTwo, myCaluclator.doCalculations(numberOne, numberTwo, Operation.DIVIDE), "Некорректная операция деления")
        );
    }

    @Test
    void checkingForExceptions() {
        Assertions.assertAll(
                () -> assertThrows(ArithmeticException.class, () -> myCaluclator.doCalculations(numberOne, 0.0, Operation.DIVIDE))
        );
    }
}
