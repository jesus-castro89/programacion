# Los Métodos en Java

En Java, un método es un bloque de código que realiza una tarea específica. Los métodos son fundamentales para la
programación orientada a objetos, ya que permiten organizar el código en unidades reutilizables y manejables. A
continuación, se describen los conceptos clave relacionados con los métodos en Java.

## Definición de un Método

Un método se define dentro de una clase y tiene la siguiente estructura básica:

```java
public static tipoDeRetorno nombreDelMetodo(tipoParametro1 parametro1, tipoParametro2 parametro2, ...) {
    // Cuerpo del método
    // Código que realiza la tarea específica
    return valor; // Si el tipo de retorno no es void
}
```

- `public`: Es un modificador de acceso que indica que el método es accesible desde otras clases. Otros modificadores
  incluyen`private`, `protected` y el acceso por defecto (sin modificador).
- `tipoDeRetorno`: Especifica el tipo de dato que el método devolverá. Si el método no devuelve ningún valor, se usa
  `void`.
- `nombreDelMetodo`: Es el nombre del método, que debe seguir las convenciones de nomenclatura de Java (por ejemplo,
  camelCase).
- `tipoParametro` y `parametro`: Son los tipos y nombres de los parámetros que el método acepta. Un método puede tener
  cero o más parámetros.
- `return`: Se utiliza para devolver un valor desde el método. Si el tipo de retorno es `void`, no se utiliza `return`.

## Ejemplo de un Método

```java
public class Calculadora {

    // Método que suma dos números y devuelve el resultado
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método que imprime un mensaje en la consola
    public static void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    void main() {
        int resultado = sumar(5, 3); // Llamada al método sumar
        imprimirMensaje("El resultado de la suma es: " + resultado); // Llamada al método imprimirMensaje
    }
}
```

## Llamada a un Método

Para utilizar un método, se debe "llamar" o "invocar" el método desde otro método, generalmente desde el método `main`.
La llamada al método incluye el nombre del método y los argumentos necesarios. Por ejemplo:

```java
int resultado = sumar(5, 3); // Llama al método sumar con los argumentos    
IO.

println("El resultado es: "+resultado); // Imprime el resultado
```

## Parámetros y Argumentos

Los parámetros son variables que se definen en la declaración del método y actúan como "placeholders" para los valores
que se pasan al método cuando se llama. Los argumentos son los valores reales que se pasan al método. Por ejemplo, en la
llamada `sumar(5, 3)`, `5` y `3` son los argumentos que se asignan a los parámetros `a` y `b` respectivamente.

## Tipos de Métodos

- **Métodos con retorno**: Devuelven un valor al lugar donde fueron llamados. Ejemplo: `int sumar(int a, int b)`.
- **Métodos sin retorno (void)**: No devuelven ningún valor. Ejemplo: `void imprimirMensaje(String mensaje)`.

## Sobrecarga de Métodos

Java permite definir múltiples métodos con el mismo nombre, siempre que tengan diferentes listas de parámetros (
diferente tipo o número de parámetros). Esto se conoce como sobrecarga de métodos.