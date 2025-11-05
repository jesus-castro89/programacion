# Ejercicio 8: El juego de dados

Escribe un programa en Java que simule el lanzamiento de dos dados. El programa debe generar dos números aleatorios
entre 1 y 6 (inclusive) para representar los valores de los dados. Luego, debe mostrar los valores de ambos dados y la
suma total. Tomando en cuenta las siguientes reglas:

- El jugador empezará con una suma de 30 monedas.
- Si la suma de los dados es 2 o 12, el jugador pierde 10 monedas.
- Si la suma de los dados es 3 u 11, el jugador gana 5 monedas.
- Si la suma de los dados es 4 o 10, el jugador pierde 5 monedas.
- Si la suma de los dados es 5 o 9, el jugador no gana ni pierde monedas.
- Si la suma de los dados es 6, 7 u 8, el jugador gana 10 monedas.
- Después de cada lanzamiento, muestra la cantidad de monedas que le quedan al jugador y se le preguntará si desea
  lanzar los dados nuevamente o salir del juego.
- El juego termina cuando el jugador decide salir o se queda sin monedas.
- Asegúrate de manejar adecuadamente la entrada del usuario para continuar o salir del juego.
- Utiliza la librería `Random` para generar los números aleatorios y la librería `JOptionPane` para la interacción con
  el usuario.
- Para la simulación del lanzamiento de dados y el juego en sí, usa funciones o métodos para organizar mejor el código.

## Generación de Números Aleatorios

Para generar números aleatorios en Java, utilizaremos la clase `Random` de la librería `java.util`. Esta clase nos
permite generar números enteros dentro de un rango específico, lo cual es ideal para simular el lanzamiento de dados.

```java
import java.util.Random;

public class JuegoDeDados {
    void main() {
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1; // Genera un número entre 1 y 6
    }
}
```

## Interacción con el Usuario

Para interactuar con el usuario, utilizaremos la clase `JOptionPane` de la librería `javax.swing`. Esta clase nos
permite mostrar cuadros de diálogo para solicitar entrada y mostrar mensajes.

```java
import javax.swing.JOptionPane;

public class JuegoDeDados {
    void main() {
        int respuesta = JOptionPane.showConfirmDialog(null,
                "¿Deseas lanzar los dados?", "Juego de Dados",
                JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "La respuesta es Sí");
        } else {
            JOptionPane.showMessageDialog(null, "La respuesta es No");
        }
    }
}
```

## Entregable

En un solo documento PDF, incluir:

1. Portada con los siguientes datos:
    * Nombre del curso.
    * Nombre del profesor.
    * Nombre de los integrantes del equipo.
    * Fecha de entrega.
2. Código fuente de los programas en Java.
3. Capturas de pantalla mostrando la ejecución de cada programa con diferentes entradas.
4. Breve explicación de cómo funciona cada programa y las decisiones tomadas en la implementación.

> **Nota**: Asegúrate de probar cada programa con diferentes entradas para verificar que funcionan correctamente en
> todos los casos.
> {style="note"}

> **Alumno que no aparezca en la portada no tendrá derecho a calificación.**
> {style="warning"}

> **Actividades entregadas fuera de la fecha de entrega, serán evaluadas con una calificación máxima de 70.**
> {style="warning"}

## Criterios de Evaluación

| Criterio                                                        | Puntuación |
|-----------------------------------------------------------------|------------|
| Correcta implementación de las operaciones                      | 40%        |
| Claridad y organización del código                              | 20%        |
| Uso adecuado de la entrada y salida (Con evidencia en capturas) | 20%        |
| Presentación del documento                                      | 10%        |
| Explicación de los programas                                    | 10%        |
| **Total**                                                       | **100%**   |