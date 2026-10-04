package katas.StringCalculator;


import java.util.stream.Collectors;

public class StringCalculator {

    static void main() {
        System.out.println(SumOfNumbers("ho1lis 1,2.3+5-10"));
    }

    static int SumOfNumbers(String text) {
           if (text == null || text.isEmpty())
               return 0;
           if (text.length() == 1 && Character.isDigit(text.charAt(0)))
             return Integer.parseInt(text);


            return text.chars()
                    .filter(Character::isDigit)
                    .map(Character::getNumericValue)
                    .sum();
    }
}





