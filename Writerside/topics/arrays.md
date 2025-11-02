# La librería `Arrays`

La librería `Arrays` en Java proporciona una variedad de métodos estáticos para manipular y trabajar con arreglos (
arrays). A continuación, se presentan algunos de los métodos más comunes de la clase `Arrays`.

| Método                                         | Descripción                                                                                                                                                            |
|------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|   
| `Arrays.sort(int[] a)`                         | Ordena el arreglo de enteros en orden ascendente.                                                                                                                      |
| `Arrays.sort(String[] a)`                      | Ordena el arreglo de cadenas en orden lexicográfico.                                                                                                                   |
| `Arrays.binarySearch(int[] a, int key)`        | Realiza una búsqueda binaria en un arreglo ordenado de enteros. Devuelve el índice del elemento si se encuentra, o un valor negativo si no se encuentra.               |
| `Arrays.equals(int[] a, int[] b)`              | Compara dos arreglos de enteros para verificar si son iguales. Devuelve `true` si son iguales, `false` en caso contrario.                                              |
| `Arrays.fill(int[] a, int val)`                | Rellena el arreglo de enteros con el valor especificado.                                                                                                               |
| `Arrays.copyOf(int[] original, int newLength)` | Crea una copia del arreglo original con la longitud especificada. Si la nueva longitud es mayor, los elementos adicionales se inicializan con el valor predeterminado. |
| `Arrays.toString(int[] a)`                     | Devuelve una representación en forma de cadena del arreglo de enteros.                                                                                                 |

## Ejemplo de Uso

```java
import java.util.Arrays;

public class ArraysExample {
    void main() {
        int[] numbers = {5, 2, 8, 1, 3};
        
        // Ordenar el arreglo
        Arrays.sort(numbers);
        IO.println("Arreglo ordenado: " + Arrays.toString(numbers));
        
        // Buscar un elemento
        int index = Arrays.binarySearch(numbers, 3);
        IO.println("Índice del elemento 3: " + index);
        
        // Comparar arreglos
        int[] otherNumbers = {1, 2, 3, 5, 8};
        boolean areEqual = Arrays.equals(numbers, otherNumbers);
        IO.println("¿Los arreglos son iguales? " + areEqual);
        
        // Rellenar un arreglo
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        IO.println("Arreglo rellenado: " + Arrays.toString(filledArray));
        
        // Copiar un arreglo
        int[] copiedArray = Arrays.copyOf(numbers, 3);
        IO.println("Arreglo copiado: " + Arrays.toString(copiedArray));
    }
}
```