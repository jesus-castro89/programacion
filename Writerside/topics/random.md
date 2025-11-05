# La librería `Random` de Java

La librería `Random` en Java se utiliza para generar números aleatorios de manera sencilla y eficiente. Proporciona
métodos para generar diferentes tipos de datos aleatorios, como enteros, flotantes y booleanos. A continuación, se
describen algunos de los métodos más comunes de la clase `Random`.

| Método                           | Descripción                                                                            |
|----------------------------------|----------------------------------------------------------------------------------------|   
| `nextInt()`                      | Devuelve un número entero aleatorio.                                                   |
| `nextInt(int bound)`             | Devuelve un número entero aleatorio entre 0 (inclusive) y `bound` (exclusivo).         |
| `nextDouble()`                   | Devuelve un número de punto flotante aleatorio entre 0.0 y 1 (exclusivo).              |    
| `nextFloat()`                    | Devuelve un número de punto flotante aleatorio entre 0.0 y 1 (exclusivo).              |
| `nextBoolean()`                  | Devuelve un valor booleano aleatorio (true o false).                                   |
| `nextLong()`                     | Devuelve un número largo aleatorio.                                                    |
| `setSeed(long seed)`             | Establece la semilla para el generador de números aleatorios.                          |
| `nextGaussian()`                 | Devuelve un valor aleatorio con distribución normal (media 0 y desviación estándar 1). |
| `nextInt(int origin, int bound)` | Devuelve un número entero aleatorio entre `origin` (inclusive) y `bound` (exclusivo).  |


## Ejemplo de Uso

```java
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        // Generar un número entero aleatorio
        int randomInt = random.nextInt(100); // Entre 0 y 99
        System.out.println("Número entero aleatorio: " + randomInt);

        // Generar un número de punto flotante aleatorio
        double randomDouble = random.nextDouble(); // Entre 0.0 y 1.0
        System.out.println("Número de punto flotante aleatorio: " + randomDouble);

        // Generar un valor booleano aleatorio
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Valor booleano aleatorio: " + randomBoolean);
    }
}
```