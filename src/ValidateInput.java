public class ValidateInput {

    /**
     * Lee un número entero positivo desde la entrada estándar.
     * Mantiene al usuario cautivo hasta que ingrese un valor válido.
     *
     * @return El número entero positivo ingresado por el usuario.
     */
    public static int readPositiveInt() {
        int number;
        String input;
        input = IO.readln("Ingrese un número entero positivo: ");
        if (input.matches("-?\\d+")) {
            number = Integer.parseInt(input);
        } else {
            IO.println("Entrada inválida.");
            number = readPositiveInt();
        }
        if (number < 1 || number > 100) {
            IO.println("Entrada inválida.");
            number = readPositiveInt();
        }
        return number;
    }

    /**
     * Lee un número entero dentro de un rango específico desde la entrada estándar.
     * Mantiene al usuario cautivo hasta que ingrese un valor válido.
     *
     * @param min El valor mínimo del rango (inclusive).
     * @param max El valor máximo del rango (inclusive).
     * @return El número entero ingresado por el usuario dentro del rango especificado.
     */
    public static int readIntInRange(int min, int max) {
        int number;
        String input;
        input = IO.readln("Ingrese un número entero entre " + min + " y " + max + ": ");
        if (input.matches("-?\\d+")) {
            number = Integer.parseInt(input);
        } else {
            IO.println("Entrada inválida.");
            number = readIntInRange(min, max);
        }
        if (number < min || number > max) {
            IO.println("Entrada inválida.");
            number = readIntInRange(min, max);
        }
        return number;
    }

    void main() {

        int number = readPositiveInt();
        IO.println("Número ingresado: " + number);
        int grade = readIntInRange(0, 100);
        IO.println("Calificación ingresada: " + grade);
    }
}
