# La librería `Random`

La librería `Random` en Java se utiliza para generar números aleatorios de manera sencilla y eficiente. A continuación,
se presentan algunos de los métodos más comunes de la clase `Random`.

| Método               | Descripción                                                                                  |
|----------------------|----------------------------------------------------------------------------------------------|   
| `nextInt()`          | Devuelve un número entero aleatorio.                                                         |
| `nextInt(int bound)` | Devuelve un número entero aleatorio entre 0 (inclusive) y el valor especificado (exclusive). |
| `nextDouble()`       | Devuelve un número de punto flotante aleatorio entre 0.0 y 1.0.                              |
| `nextFloat()`        | Devuelve un número de punto flotante aleatorio entre 0.0f y 1.0f.                            |
| `nextLong()`         | Devuelve un número largo aleatorio.                                                          |
| `nextBoolean()`      | Devuelve un valor booleano aleatorio (true o false).                                         |

## Ejemplo de Uso

```java
import java.util.Random;

public class RandomExample {
    void main() {
        Random random = new Random();

        // Generar un número entero aleatorio
        int randomInt = random.nextInt();
        IO.println("Número entero aleatorio: " + randomInt);

        // Generar un número entero aleatorio entre 0 y 99
        int boundedInt = random.nextInt(100);
        IO.println("Número entero aleatorio entre 0 y 99: " + boundedInt);

        // Generar un número de punto flotante aleatorio
        double randomDouble = random.nextDouble();
        IO.println("Número de punto flotante aleatorio: " + randomDouble);

        // Generar un valor booleano aleatorio
        boolean randomBoolean = random.nextBoolean();
        IO.println("Valor booleano aleatorio: " + randomBoolean);
    }
}
```

## Conclusión

La clase `Random` es una herramienta poderosa para generar números aleatorios en Java, lo que es útil en una variedad de
aplicaciones, desde juegos hasta simulaciones y pruebas.