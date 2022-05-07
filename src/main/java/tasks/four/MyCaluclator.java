package tasks.four;

public class MyCaluclator extends AbstractCalculator {

    @Override
    public void printResult() {
        System.out.println(result == null ? MSG : "Получаем результат : " + result);
    }
}
