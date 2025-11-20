import java.util.Arrays;

public class Ejemplo {

    void main() {

        int[] numeros = {5, 10, 15, 15, 25};
        int suma = Arrays.stream(numeros).sum();
        IO.println("La suma de los números es: " + suma);
        int promedio = suma / numeros.length;
        IO.println("El promedio de los números es: " + promedio);
        int mediana = numeros[numeros.length / 2];
        IO.println("La mediana de los números es: " + mediana);
        int[] foundModa;
        for (int j : numeros) {
            int count = 0;
            for (int numero : numeros) {
                if (numero == j) {
                    count++;
                }
            }
            if (count > 1) {
                foundModa = new int[count];
                Arrays.fill(foundModa, j);
                IO.println("La moda de los números es: " + Arrays.toString(foundModa));
                break;
            }
        }
    }
}