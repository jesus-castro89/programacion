import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        double circunferencia = 2 * Math.PI * radio;
        System.out.printf("La circunferencia del círculo es: %.2f\n", circunferencia);
        scanner.close();
    }
}