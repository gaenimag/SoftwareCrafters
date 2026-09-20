package katas;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(obtenerFizzBuzz(i));
        }
    }

    private static String obtenerFizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        } else if (num % 3 == 0) {
            return "fizz";
        } else if (num % 5 == 0) {
            return "buzz";
        } else {
            return Integer.toString(num);
        }
    }
}




