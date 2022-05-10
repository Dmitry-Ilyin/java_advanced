package newCalculator.calculator;

public class MyCalculator extends AbstractCalculator {

    @Override
    public void printResult() {
        System.out.println(result == null ? MSG : "Получаем результат : " + result);
    }
}
