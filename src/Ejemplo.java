public class Ejemplo {

    public static void multiplyTable(int n) {

        for (int i = 1; i <= 10; i++) {

            IO.println(n + " x " + i + " = " + (n * i));
        }
    }

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

    public static double getReal() {

        String input = IO.readln("Ingrese un número real: ");
        if (input.matches("-?\\d+(\\.\\d+)?")) {
            return Double.parseDouble(input);
        } else {
            IO.println("Entrada inválida. Por favor, ingrese un número real.");
            // Llamada recursiva hasta obtener un número válido
            return getReal();
        }
    }

    public static int getRandom(int min, int max) {

        return (int) (Math.random() * (max - min + 1)) + min;
    }

    void main() {

        int dice = (int) (Math.random() * 6) + 1;
        IO.println("Número aleatorio entre 1 y 6: " + dice);
    }
}