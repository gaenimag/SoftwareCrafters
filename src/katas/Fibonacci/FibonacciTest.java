package katas.Fibonacci;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    @DisplayName("Should return 0 when the input is 0")
    void shouldReturnZeroWhenInputIsZero() {
        assertEquals(0, Fibonacci.obtenerEnesimoFibonacci(0));
    }

    @Test
    @DisplayName("Should return 1 when the input is 1")
    void shouldReturnOneWhenInputIsOne() {
        assertEquals(1, Fibonacci.obtenerEnesimoFibonacci(1));
    }

    @Test
    @DisplayName("Should return 1 when the input is 2")
    void shouldReturnOneWhenInputIsTwo() {
        assertEquals(2, Fibonacci.obtenerEnesimoFibonacci(3));
    }

    @Test
    @DisplayName("Should return 55 when the input is 10")
    void shouldReturnFiftyFiveWhenInputIsTen() {
        assertEquals(55, Fibonacci.obtenerEnesimoFibonacci(10));
    }
}