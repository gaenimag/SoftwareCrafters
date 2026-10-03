package katas.FizzBuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;

@DisplayName("FizzBuzz")
class FizzBuzzTest {

    @Test
    @DisplayName("returns number one as a string for number one")
    void returnsNumberOneAsStringForNumberOne() {
        assertEquals("1", FizzBuzz.ObtenerFizzBuzz(1));
    }

    @Test
    @DisplayName("returns number two as a string for number two")
    void returnsNumberOneAsStringForNumberTwo() {
        assertEquals("2", FizzBuzz.ObtenerFizzBuzz(2));
    }

    @Test
    @DisplayName("returns fizz for number three")
    void returnsFizzForNumberThree() {
        assertEquals("Fizz", FizzBuzz.ObtenerFizzBuzz(3));
    }

    @Test
    @DisplayName("returns buzz for number five")
    void returnsBuzzForNumberFive() {
        assertEquals("buzz", FizzBuzz.ObtenerFizzBuzz(5));
    }

    @Test
    @DisplayName("returns fizzbuzz for number fifteen")
    void returnsFizzBuzzForNumberFifteen() {
        assertEquals("fizzbuzz", FizzBuzz.ObtenerFizzBuzz(15));
    }

    @Test
    @DisplayName("returns fizz for any number divisible by three")
    void returnsFizzForAnyNumberDivisibleByThree() {
        assertEquals("fizz", FizzBuzz.ObtenerFizzBuzz(6));
    }

    @Test
    @DisplayName("returns fizz for any number divisible by three")
    void returnsBuzzForAnyNumberDivisibleByFive() {
        assertEquals("buzz", FizzBuzz.ObtenerFizzBuzz(10));
    }

    @Test
    @DisplayName("returns fizzbuzz for any number divisible by fifteen")
    void returnsFizzBuzzForAnyNumberDivisibleByFifteen() {
        assertEquals("fizzbuzz", FizzBuzz.ObtenerFizzBuzz(45));
    }

    @Test
    @DisplayName("returns number  as a string for any number that is not divisible by three or five")
    void returnsNumberForOthers() {
        assertEquals("37", FizzBuzz.ObtenerFizzBuzz(37));
    }
}
