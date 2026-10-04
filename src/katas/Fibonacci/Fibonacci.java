package katas.Fibonacci;

public class Fibonacci {

    /**
     * Devuelve el enésimo número de la serie de Fibonacci.
     * Considera la serie comenzando en F(0) = 0 y F(1) = 1.
     */
    public static long obtenerEnesimoFibonacci(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("El número n debe ser un entero no negativo.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        long previo2 = 0;
        long previo1 = 1;
        long actual = 0;

        for (int i = 2; i <= n; i++) {
            actual = previo1 + previo2;
            previo2 = previo1;
            previo1 = actual;
        }

        return actual;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("El número de Fibonacci en la posición " + n + " es: " + obtenerEnesimoFibonacci(n));
        // Salida: 55
    }
}
