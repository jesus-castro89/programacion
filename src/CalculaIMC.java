import java.util.Scanner;

public class CalculaIMC {

    public static void main(String[] args) {
        String nombre;
        double peso, estatura, imc;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su peso en kilogramos: ");
        peso = input.nextDouble();
        System.out.print("Ingrese su estatura en metros: ");
        estatura = input.nextDouble();
        imc = peso / (estatura * estatura);
        System.out.printf("%s, su índice de masa corporal (IMC) es: %.2f%n" +
                "con tus datos de peso(%.2f) y estatura(%.2f)",
                nombre, imc, peso, estatura);
        input.close();
    }
}
