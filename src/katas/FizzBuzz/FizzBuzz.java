package katas.FizzBuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(ObtenerFizzBuzz(i));
        }
    }

    public static String ObtenerFizzBuzz(int num) {
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
// código original para recrear la idea que tuve al comienzo pero sin éxito :(

/*
java: compact source file should not have package declaration

package katas;

public class FizzBuzz {
    private static boolean multiplo3;
    private static boolean multiplo5;
    private static boolean multiplo3y5;

    //Escribe un programa que muestre en pantalla los números del 1 al 100.
    // Pero sustituye los múltiplos de 3 por ‘fizz’,
    // los de 5 por ‘buzz’,
    // y los múltiplos de ambos por ‘fizzbuzz’. String!!

    // repo https://github.com



    // generar numeros del 1 al 100
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            String f, b, fb, out = "";
            f =  multiplo3(i) ;
            b =  multiplo5(i) ;
            fb =  multiplo3y5(i) ;

            if (f.equals("0")) {
                out = f;
            } else if (b.equals("0")) {
                out = b;
            } else if (fb.equals("0")) {
                out = fb;
            }
            else  out = Integer.toString(i);
        }

        System.out.println(out);

    }

}


// validacion para reemplazar multiplos de 3 por ‘fizz’
private static String multiplo3(int num) {
    return num % 3 == 0 ? "fizz" : Integer.toString(0);
}

// validacion para reemplazar multiplos de 5 por ‘buzz’
static String multiplo5(int num) {
    return num % 5 == 0 ? "buzz" : Integer.toString(0);
}

// validacion para reemplazar multiplos de 3 y 5 por ‘fizzbuzz’
static String multiplo3y5(int num) {
    return (num % 3 == 0 && num % 5 == 0) ? "fizzbuzz" : Integer.toString(0);
}


 */



