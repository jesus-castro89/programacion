# Ejercicio 11: Registro de Calificaciones de un Grupo

## Descripción

Imagina que eres el coordinador de un pequeño grupo de estudiantes. Necesitas llevar un registro sencillo de sus
calificaciones en tres materias: Matemáticas, Historia y Computación. Para almacenar esta información de forma ordenada,
utilizaremos una matriz bidimensional, donde cada fila representa a un alumno y cada columna una materia.

Podemos pensar en la matriz como una tabla:

| Alumno | Matemáticas | Historia | Computación |
|--------|-------------|----------|-------------|
| 0      | 85          | 90       | 74          |
| 1      | 70          | 88       | 91          |
| 2      | 95          | 80       | 89          |

## Objetivo

Escribe un programa en Java que realice las siguientes tareas:

1. Define una matriz bidimensional para almacenar las calificaciones de los alumnos en las tres materias.
2. Solicita al usuario que ingrese la cantidad de alumnos en el grupo. (Mínimo 1, máximo 10)
3. Para cada alumno, solicita al usuario que ingrese las calificaciones en Matemáticas, Historia y Computación.
   Asegúrate de que las calificaciones sean números enteros entre 0 y 100.
4. Después de ingresar todas las calificaciones, el programa debe calcular y mostrar:
    - El promedio de calificaciones para cada materia.
    - La calificación más alta y más baja en cada materia.
    - La calificación promedio de cada alumno.
5. Proporciona mensajes claros al usuario para guiarlo a través del proceso.
6. Utiliza el validador de entradas para asegurarte de que el usuario ingrese datos válidos (números enteros entre 0 y
   100), y maneja cualquier entrada inválida adecuadamente.

### Validación de Entradas intBetween

Crea un método estático en la clase `InputValidator` llamado
`getIntBetween(String message, String title, int min, int max)`
que solicite al usuario un número entero dentro de un rango específico (mínimo y máximo). Si la entrada no es válida,
muestra un mensaje de error y vuelve a solicitar la entrada hasta que sea válida.

Esta función debe utilizar expresiones regulares para validar que la entrada es un número entero y luego verificar que
esté dentro del rango especificado de la siguiente manera:

```java
public static int getIntBetween(String message, String title, int min, int max) {
    while (true) {
        String input = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
        if (input != null && input.matches("^-?\\d+$")) {
            int value = Integer.parseInt(input);
            if (value >= min && value <= max) {
                return value;
            }
        }
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero entre " + min + " y " + max + ".", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
    }
}
```

## Entrega

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

| Criterio                        | Descripción                                                                   | Puntos   |
|---------------------------------|-------------------------------------------------------------------------------|----------|
| Implementación de la matriz     | La matriz bidimensional está definida y utilizada correctamente.              | 30%      |
| Validación de entradas          | El programa maneja entradas inválidas adecuadamente.                          | 20%      |
| Cálculo de promedios y extremos | Las calificaciones promedio, más altas y más bajas se calculan correctamente. | 40%      |
| Pruebas y documentación         | El programa ha sido probado y documentado adecuadamente.                      | 10%      |
| **Total**                       |                                                                               | **100%** |