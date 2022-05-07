package tasks.three.taskTwo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Candy coco = new Candy("Coco", 2000.0, 345.55, "orange");
        Candy candy = new Candy("candy", 1540.0, 413.15, "apple");
        Jellybean bee = new Jellybean("bee", 1375.0, 531.41, "peach");
        Jellybean mentos = new Jellybean("mentos", 1678.0, 970.44, "strawberry");
        Candy cocololo = new Candy();
        cocololo.setName("cocololo");
        cocololo.setWeight(1213.12);
        cocololo.setPrice(657.57);
        cocololo.setTaste("coconut");

        AbstractSweet[] abstractSweets = new AbstractSweet[]{coco, candy, bee, mentos, cocololo};

        System.out.println("Общий вес подарка : " + Arrays.stream(abstractSweets).mapToDouble(AbstractSweet::getWeight).sum());
        System.out.println("Общая стоимость подарка : " + Arrays.stream(abstractSweets).mapToDouble(AbstractSweet::getPrice).sum());
        System.out.println(Arrays.toString(abstractSweets));
    }
}
