import java.io.Console;

public class VendingMachine {

    public static int getNumber(String prompt) {

        String input = IO.readln(prompt);
        if (input.matches("-?\\d+")) {
            return Integer.parseInt(input);
        } else {
            IO.println("Entrada inválida. Por favor, ingrese un número entero.");
            return getNumber(prompt);
        }
    }

    public double selectProduct() {
        String menu = """
                Máquina Expendedora
                1. Agua - $10.00
                2. Refresco - $15.00
                3. Jugo - $12.00
                4. Salir
                """;
        int option;
        do {
            IO.println(menu);
            option = Combination.getNumber();
            if (option < 1 || option > 4)
                IO.println("Opción inválida. Por favor, seleccione una opción del 1 al 4.");
        } while (option < 1 || option > 4);
        return switch (option) {
            case 1 -> 10.0;
            case 2 -> 15.0;
            case 3 -> 12.0;
            default -> 0.0;
        };
    }

    void main() {

        double total = 0.0;
        double price;
        String productos = "";
        do {
            price = selectProduct();
            total += price;
            if (price > 0) {
                IO.println("Producto agregado. Precio: $" + price);
                productos = productos.concat(switch ((int) price) {
                    case 10 -> "Agua - $10.00\n";
                    case 15 -> "Refresco - $15.00\n";
                    case 12 -> "Jugo - $12.00\n";
                    default -> "";
                });
            }
        } while (price > 0);
        IO.println("Productos seleccionados:\n" + productos);
        IO.println("Total a pagar: $" + total);
    }
}
