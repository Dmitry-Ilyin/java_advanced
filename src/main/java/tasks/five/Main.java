package tasks.five;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new TreeMap<>();
        try (Stream<String> stream = Files.lines(Paths.get("src/main/resources/text.txt"), StandardCharsets.UTF_8)) {
            stream.forEach(line -> list.addAll(Arrays.asList(line.toLowerCase(Locale.ROOT).split(" "))));
            list.forEach(s -> map.merge(s, 1, Integer::sum));
            String maxCountKey = map.entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue())
                    .orElseThrow(Exception::new)
                    .getKey();

            System.out.println(list);
            System.out.println(map);
            System.out.println("Слово которое встречается максимальное кол-во раз : " + maxCountKey + "\n" +
                    "В файле данных слов : " + map.get(maxCountKey));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Максимальный элемент не найден");
        }
    }
}
