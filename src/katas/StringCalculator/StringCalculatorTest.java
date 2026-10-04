package katas.StringCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    @DisplayName("Convert to 0 if enter is empty")
    void convertToCeroIfEnterIsEmpty() {
        assertEquals(0, StringCalculator.SumOfNumbers(" "));
    }

    @Test
    @DisplayName("Convert to 0 if enter is null")
    void convertToCeroIfEnterIsNull() {
        assertEquals(0, StringCalculator.SumOfNumbers(null));
    }

    @Test
    @DisplayName("Convert to number if enter is only a number")
    void convertToNumberIfEnterIsANumber() {
        assertEquals(1, StringCalculator.SumOfNumbers("1"));
    }

    @Test
    @DisplayName("Sum the numbers ignoring other characters")
    void sumTheNumbersIgnoringOtherCharacters() {
        assertEquals(3, StringCalculator.SumOfNumbers("hola-1 1 mun1do"));
    }

    @Test
    @DisplayName("Sum the numbers separated by comma")
    void sumTheNumbersSeparatedByComma() {
        assertEquals(6, StringCalculator.SumOfNumbers("1,2,3"));
    }
}