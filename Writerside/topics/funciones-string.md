# Funciones de la clase `String` en Java

La clase `String` en Java proporciona una variedad de métodos para manipular y trabajar con cadenas de texto. A
continuación, se presentan algunos de los métodos más comunes de la clase `String`.

| Método                                    | Descripción                                                                       |
|-------------------------------------------|-----------------------------------------------------------------------------------|   
| `length()`                                | Devuelve la longitud de la cadena.                                                |
| `charAt(int index)`                       | Devuelve el carácter en la posición especificada.                                 |
| `substring(int beginIndex)`               | Devuelve una subcadena desde el índice especificado hasta el final de la cadena.  |
| `substring(int beginIndex, int endIndex)` | Devuelve una subcadena desde el índice inicial hasta el índice final (exclusivo). |
| `toUpperCase()`                           | Convierte todos los caracteres de la cadena a mayúsculas.                         |
| `toLowerCase()`                           | Convierte todos los caracteres de la cadena a minúsculas.                         |
| `trim()`                                  | Elimina los espacios en blanco al principio y al final de la cadena.              |
| `replace(char oldChar, char newChar)`     | Reemplaza todas las ocurrencias de un carácter específico por otro carácter.      |
| `indexOf(String str)`                     | Devuelve el índice de la primera aparición de la subcadena especificada.          |
| `lastIndexOf(String str)`                 | Devuelve el índice de la última aparición de la subcadena especificada.           |
| `equals(String anotherString)`            | Compara la cadena con otra cadena para verificar si son iguales.                  |
| `equalsIgnoreCase(String anotherString)`  | Compara la cadena con otra cadena sin tener en cuenta mayúsculas y minúsculas.    |
| `contains(CharSequence s)`                | Verifica si la cadena contiene la secuencia de caracteres especificada.           |


## Ejemplo de Uso

```java
public class StringExample {
    void main() {
        String str = "  Hola Mundo  ";
        IO.println("Longitud: " + str.length());
        IO.println("Carácter en índice 1: " + str.charAt(1));
        IO.println("Subcadena (0, 4): " + str.substring(0, 4));
        IO.println("Mayúsculas: " + str.toUpperCase());
        IO.println("Minúsculas: " + str.toLowerCase());
        IO.println("Trim: '" + str.trim() + "'");
        IO.println("Reemplazar 'o' por 'a': " + str.replace('o', 'a'));
        IO.println("Índice de 'Mundo': " + str.indexOf("Mundo"));
        IO.println("¿Contiene 'Hola'? " + str.contains("Hola"));
    }
}
```