package tasks.three.taskOne;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class MyArrays {
    public static void main(String[] args) {
        int[] array = new Random().ints(20, -10, 11).limit(20).toArray();
        Integer[] arrayInteger = Arrays.stream(array).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
        int minPositive = Arrays.stream(array).filter(i -> i > 0).min().orElseThrow(NoSuchElementException::new);
        System.out.println("Минимальный положительный элемент : " + minPositive);

        int maxNegative = Arrays.stream(array).filter(i -> i < 0).max().orElseThrow(NoSuchElementException::new);
        System.out.println("Максимальный отрицательный элемент : " + maxNegative);

        int indexMinPositive = Arrays.asList(arrayInteger).indexOf(minPositive);
        System.out.println("Индекс первого минимального положительного элемента : " + indexMinPositive);

        int indexMaxNegative = Arrays.asList(arrayInteger).indexOf(maxNegative);
        System.out.println("Индекс первого максимального отрицательного элемента : " + indexMaxNegative);

        array[indexMinPositive] = maxNegative;
        array[indexMaxNegative] = minPositive;
        System.out.println(Arrays.toString(array));
    }
}
