package problems.stream.problems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {

    public static void firstOccurrence(String word) {

        char ch = word
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors
                        .groupingBy(Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() ->
                        new NoSuchElementException("No Such Element Exception "));

        System.out.println("First character occurrence = " + ch);

    }

    public static void main(String[] args) {
        String name = "Ankit";
        firstOccurrence(name);
    }

}
