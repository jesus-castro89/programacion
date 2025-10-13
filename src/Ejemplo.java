public class Ejemplo {

    void main() {
        // Escribir
        IO.println("Texto");
        // Leer un entero
        int n = Integer.parseInt(IO.readln("Número: "));
        // Leer un real
        double x = Double.parseDouble(IO.readln("Real: "));
        // Leer una cadena
        String s = IO.readln("Cadena: ");
        // Mostrar variables
        IO.println("n = " + n + ", x = " + x + ", s = " + s);
    }
}