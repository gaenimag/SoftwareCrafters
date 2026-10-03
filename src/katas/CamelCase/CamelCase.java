package katas.CamelCase;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.awt.SystemColor.text;

public class CamelCase {

static void main(String[] args) {
    System.out.println(ConvertToCamelCase(" "));
    }

        public static String ConvertToCamelCase(String text) {
            if (text == null || text.trim().isEmpty()) {
                return "";
            }

            String[] words = text.split("[ _-]");
            return Arrays.stream(words)
                    .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                    .collect(Collectors.joining(""));
        }
}