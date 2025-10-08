public class Ejemplo {

    void main() {

        int numero = Integer.parseInt(
                IO.readln("Ingrese un número entero: "));
        IO.println("%s x 1 = %s".formatted(numero, numero * 1));
        IO.println("%s x 2 = %s".formatted(numero, numero * 2));
        IO.println("%s x 3 = %s".formatted(numero, numero * 3));
        IO.println("%s x 4 = %s".formatted(numero, numero * 4));
        IO.println("%s x 5 = %s".formatted(numero, numero * 5));
        IO.println("%s x 6 = %s".formatted(numero, numero * 6));
        IO.println("%s x 7 = %s".formatted(numero, numero * 7));
        IO.println("%s x 8 = %s".formatted(numero, numero * 8));
        IO.println("%s x 9 = %s".formatted(numero, numero * 9));
        IO.println("%s x 10 = %s".formatted(numero, numero * 10));

        int i = 1;
        while (i <= 10) {
            IO.println(i);
            i++;
        }

        int a = Integer.parseInt(
                IO.readln("Ingrese un número entero: "));
        int b = Integer.parseInt(
                IO.readln("Ingrese otro número entero: "));

        if (a % b == 0) {
            IO.println("%s es múltiplo de %s".formatted(a, b));
        } else {
            IO.println("%s no es múltiplo de %s".formatted(a, b));
        }
    }
}