package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountExp {

    public static Map<String, Long> countWordFrequency(List<String> words) {

        return words
                .stream()
                .collect(Collectors
                        .groupingBy(Function.
                                identity(), Collectors
                                .counting()));
    }

    public static void main(String[] arg) {

        List<String> words = new ArrayList<>();
        words.add("Ankit");
        words.add("Ankit");
        words.add("Srivastava");
        words.add("Rintu");

        Map<String, Long> wordCount = countWordFrequency(words);
        System.out.println(wordCount);

    }

}
