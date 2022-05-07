package tasks.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Double num1 = null, num2 = null;
        String symbol;
        Operation operation = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите первое число : ");
            num1 = Double.parseDouble(reader.readLine());
            System.out.print("Введите второе число : ");
            num2 = Double.parseDouble(reader.readLine());
            System.out.print("Укажите операцию : ");
            symbol = reader.readLine();
            Operation[] arrayOperation = Operation.values();
            operation = Arrays.stream(arrayOperation).filter(i -> i.getOperation().equals(symbol)).findFirst().orElseThrow(IllegalArgumentException::new);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка! Вы ввели не число");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка! Вы ввели некорректный знак");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! На ноль делить нельзя");
        }

        MyCaluclator caluclator = new MyCaluclator();
        caluclator.doCalculations(num1, num2, operation);
        caluclator.printResult();
    }
}
