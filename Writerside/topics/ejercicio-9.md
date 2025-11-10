# Ejercicio 9: Validación de entradas de usuario

## Objetivo

El objetivo de este ejercicio es crear una clase auxiliar en Java que facilite la obtención y validación de entradas del
usuario utilizando `JOptionPane`. La clase debe proporcionar métodos para solicitar diferentes tipos de datos,
incluyendo cadenas de texto, números enteros y números decimales, asegurando que las entradas sean válidas antes de
de retornarlas.

## Instrucciones

1. Crea una nueva clase llamada `InputValidator.java`.
2. Implementa los siguientes métodos estáticos en la clase `InputValidator`:
    - `getStringInput(String message, String title)`: Solicita una cadena de texto al usuario y la retorna.
    - `getIntInput(String message, String title)`: Solicita un número entero al usuario. Si la entrada no es un número
      entero válido, muestra un mensaje de error y vuelve a solicitar la entrada hasta que sea válida.
    - `getDoubleInput(String message, String title)`: Solicita un número decimal al usuario. Si la entrada no es un
      número decimal válido, muestra un mensaje de error y vuelve a solicitar la entrada hasta que sea válida.
3. Utiliza expresiones regulares para validar las entradas de números enteros y decimales, esto mediante el método
   `matches()`:
    - Para números enteros, utiliza la expresión `^-?\d+$`.
    - Para números decimales, utiliza la expresión `^-?\d+(\.\d+)?$`.
4. Asegúrate de que cada método utilice `JOptionPane` para mostrar los cuadros de diálogo de entrada y error.
5. Para poner a prueba la clase, crea un programa `TestInputValidator.java` que defina los metodos:
    - `calcularAreaRectangulo()`: Solicita al usuario la base y la altura de un rectángulo utilizando
      `InputValidator` y calcula su área.
    - `calcularPerimetroCuadrado()`: Solicita al usuario el lado de un cuadrado utilizando `InputValidator` y calcula su
      perímetro.
    - `calcularVolumenCubo()`: Solicita al usuario el lado de un cubo utilizando `InputValidator` y calcula su volumen.
    - `calcularPromedio()`: Solicita al usuario una serie de números decimales utilizando `InputValidator` hasta que el
      usuario decida dejar de ingresar números, y luego calcula y muestra el promedio de los números ingresados.
    - `calcularAreaCirculo()`: Solicita al usuario el radio de un círculo utilizando `InputValidator` y calcula su área.
    - `calcularHipotenusa()`: Solicita al usuario los catetos de un triángulo rectángulo utilizando `InputValidator` y
      calcula la hipotenusa. Utiliza el teorema de Pitágoras para el cálculo.
6. Documenta cada método con comentarios que expliquen su funcionalidad y los parámetros que recibe.
7. Prueba cada uno de los métodos en `TestInputValidator.java` para asegurarte de que funcionan correctamente con
   diferentes entradas.
8. Asegúrate de que el programa compile y se ejecute sin errores.

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

| Criterio                    | Descripción                                                   | Puntos   |
|-----------------------------|---------------------------------------------------------------|----------|
| Implementación de funciones | Todas las funciones requeridas están definidas correctamente. | 40%      |
| Validación de entradas      | Las entradas del usuario son validadas correctamente.         | 30%      |
| Uso de `JOptionPane`        | Se utiliza `JOptionPane` para la interacción con el usuario.  | 20%      |
| Pruebas y documentación     | El programa ha sido probado y documentado adecuadamente.      | 10%      |
| **Total**                   |                                                               | **100%** |