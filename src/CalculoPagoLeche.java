import java.util.Scanner;

public class CalculoPagoLeche {

    public static void main(String[] args) {

        // Creación del objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Declaración de variables
        // Represente los litros producidos por el ganadero
        double litrosProducidos;
        // Represente el precio por galón de leche
        double precioPorGalon;
        // Represente la conversion de litros a galones
        double galonesProducidos;
        // Represente el pago total al ganadero
        double pagoTotal;

        // Solicitar al usuario la cantidad de litros producidos
        // Equivalente a 2. ESCRIBIR "....."
        System.out.print("Ingrese la cantidad de litros producidos: ");

        // Leer la cantidad de litros producidos
        // Equivalente a 3. LEER litrosProducidos
        litrosProducidos = sc.nextDouble();

        // Solicitar al usuario el precio por galón de leche
        // Equivalente a 4. ESCRIBIR "....."
        System.out.print("Ingrese el precio por galón de leche: ");

        // Leer el precio por galón de leche
        // Equivalente a 5. LEER precioPorGalon
        precioPorGalon = sc.nextDouble();

        // Calcular la cantidad de galones producidos
        // Equivalente a
        // 6. HACER galonesProducidos = litrosProducidos / 3.785
        galonesProducidos = litrosProducidos / 3.785;

        // Calcular el pago total al ganadero
        // Equivalente a
        // 7. HACER pagoTotal = galonesProducidos * precioPorGalon
        pagoTotal = galonesProducidos * precioPorGalon;

        // Mostrar el pago total al ganadero
        // Equivalente a 8. ESCRIBIR ".....", pagoTotal
        System.out.printf(
                "El pago total al ganadero es: %.2f\n", pagoTotal);

        // Cerrar el objeto Scanner
        // Equivalente a 9. FIN
        sc.close();
    }
}