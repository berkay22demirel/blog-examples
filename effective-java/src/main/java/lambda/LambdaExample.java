package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class LambdaExample {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Hello", "World");

        words.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        words.sort(comparingInt(String::length));
    }
}
