public class Menu {

    void main() {
        String menu = """
                Menú de opciones:"";
                        1. Sumar
                        2. Restar
                        3. Multiplicar
                        4. Dividir
                        5. Salir
                        Elija una opción (1-5): 
                """;
        int choice = Integer.parseInt(IO.readln(menu));
        String operation = switch (choice) {
            case 1 -> "Sumar";
            case 2 -> "Restar";
            case 3 -> "Multiplicar";
            case 4 -> "Dividir";
            case 5 -> "Salir";
            default -> "Opción inválida";
        };
        IO.println("Operación seleccionada: " + operation);
    }
}
