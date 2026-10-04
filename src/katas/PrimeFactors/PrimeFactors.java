package katas.PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    /**
     * Devuelve una lista con los factores primos de un número natural en orden ascendente.
     */
    public static List<Integer> obtenerFactoresPrimos(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("El número debe ser un número natural (mayor o igual a 1).");
        }

        List<Integer> factores = new ArrayList<>();

        // Evaluamos el 2 por separado para poder avanzar de 2 en 2 en el bucle posterior
        while (n % 2 == 0) {
            factores.add(2);
            n /= 2;
        }

        // Evaluamos los números impares desde 3 hasta la raíz cuadrada de n
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factores.add(i);
                n /= i;
            }
        }

        // Si al final n es mayor que 1, lo que queda es un número primo
        if (n > 1) {
            factores.add(n);
        }

        return factores;
    }

    public static void main(String[] args) {
        int numero = 315;
        System.out.println("Factores primos de " + numero + ": " + obtenerFactoresPrimos(numero));
        // Salida: [3, 3, 5, 7] (ya que 3 * 3 * 5 * 7 = 315)
    }
}

