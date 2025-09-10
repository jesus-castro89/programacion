import java.util.Scanner;

public class PromedioCalificaciones {

    public static void main(String[] args) {
        // Definir variables
        double ex1, ex2, ex3, ex4, promedio;
        // Definir el scanner
        Scanner input = new Scanner(System.in);
        // Pedir las calificaciones
        System.out.print("Ingrese la primer calificación: ");
        ex1 = input.nextDouble();
        System.out.print("Ingrese la segunda calificación: ");
        ex2 = input.nextDouble();
        System.out.print("Ingrese la tercer calificación: ");
        ex3 = input.nextDouble();
        System.out.print("Ingrese la cuarta calificación: ");
        ex4 = input.nextDouble();
        // Calcular el promedio
        promedio = (ex1 + ex2 + ex3 + ex4) / 4;
        // Mostrar el promedio
        System.out.printf("El promedio es: %.1f", promedio);
    }
}
