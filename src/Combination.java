public class Combination {

    /**
     * Solicita al usuario que ingrese un número entero y lo valida.
     * Si la entrada no es válida, solicita nuevamente hasta obtener un número correcto.
     * {@snippet lang = java:
     * int number = Ejemplo.getNumber();}
     * @return El número entero ingresado por el usuario.
     */
    public static int getNumber() {

        String input = IO.readln("Ingrese un número entero: ");
        if (input.matches("-?\\d+")) {
            return Integer.parseInt(input);
        } else {
            IO.println("Entrada inválida. Por favor, ingrese un número entero.");
            return getNumber();
        }
    }



    public int factorial(int num) {

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public void combination(int m, int n) {

        if (m >= n && n >= 0) {
            int comb = factorial(m) / (factorial(n) * factorial(m - n));
            IO.println("El número de combinaciones de " + m
                    + " elementos tomados de " + n + " en " + n + " es: " + comb);
        } else {
            IO.println("Error: Asegúrese de que m >= n y n >= 0.");
        }
    }

    void main() {
        combination(getNumber(), getNumber());
    }
}
