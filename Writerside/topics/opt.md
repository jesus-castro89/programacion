# Diseño de Funciones en Java

Dentro de Java, las funciones (o métodos) son bloques de código que realizan tareas específicas y pueden ser
reutilizados en diferentes partes del programa. A continuación, se describen los conceptos básicos para diseñar
funciones en Java:

1. **Definición de una Función**:
    - Una función en Java se define dentro de una clase y tiene la siguiente estructura básica:
      ```java
      public static nombreDeLaFuncion([tipo parametro1, tipo parametro2, ...]) {
          // Cuerpo de la función
      }
      ```
    - `modificador_de_acceso`: Define la visibilidad de la función (por ejemplo, `public`, `private`, `protected`).
    - `tipo_de_retorno`: Especifica el tipo de dato que la función devolverá (por ejemplo, `int`, `String`, `void` si no
      devuelve nada).
    - `nombreDeLaFuncion`: Es el nombre que se le da a la función, debe seguir las convenciones de nomenclatura de Java.
    - `parametro`: Son los valores que la función puede recibir para realizar su tarea.
2. **Llamada a una Función**:
    - Para utilizar una función, se debe llamar por su nombre y pasar los argumentos necesarios:
      ```java
      nombreDeLaFuncion(valor1, valor2, ...);
      ```
3. **Ejemplo de una Función Simple**:
   ```java
   public class EjemploFunciones {
       // Función que suma dos números y devuelve el resultado
       public static int sumar(int a, int b) {
           return a + b;
       }
   
         void main() {
              int resultado = sumar(5, 10);
              System.out.println("La suma es: " + resultado);
         }
    }
    ```
4. **Funciones con Diferentes Tipos de Retorno**:
    - Una función puede devolver diferentes tipos de datos, como `int`, `double`, `String`, etc. Si no necesita devolver
      ningún valor, se utiliza `void`.
5. **Funciones con Parámetros**:
    - Las funciones pueden aceptar múltiples parámetros, y estos pueden ser de diferentes tipos de datos.

## Buenas Prácticas para el Diseño de Funciones

* **Nombres Descriptivos**: Utiliza nombres claros y descriptivos para las funciones que indiquen su propósito.
* **Funciones Pequeñas**: Mantén las funciones pequeñas y enfocadas en una sola tarea.
* **Documentación**: Añade comentarios y documentación para explicar el propósito y el uso de la función.
* **Evitar Efectos Secundarios**: Las funciones deben evitar modificar variables globales o estados externos a menos que
  sea necesario.
* **Reutilización**: Diseña funciones que puedan ser reutilizadas en diferentes partes del programa o en otros
  proyectos.