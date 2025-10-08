# Funciones Recursivas en Java

La recursividad es una técnica de programación en la que una función se llama a sí misma para resolver un problema. En
Java, las funciones recursivas son útiles para problemas que pueden ser divididos en subproblemas más pequeños y
similares al problema original.

## Estructura de una Función Recursiva

Una función recursiva en Java generalmente tiene dos componentes principales:

1. **Caso Base**: Es la condición que detiene la recursión. Sin un caso base, la función se llamaría a sí misma
   indefinidamente, lo que llevaría a un desbordamiento de pila (stack overflow).
2. **Llamada Recursiva**: Es la parte de la función donde se llama a sí misma con un argumento modificado, acercándose
   al caso base.

```java
public class Recursividad {
    // Función recursiva para calcular el factorial de un número
    public static int factorial(int n) {
        // Caso base: si n es 0, el factorial es 1
        if (n == 0) {
            return 1;
        } else {
            // Llamada recursiva: n * factorial de (n-1)
            return n * factorial(n - 1);
        }
    }

    void main() {
        int numero = 5;
        int resultado = factorial(numero);
        IO.println("El factorial de " + numero + " es: " + resultado);
    }
}
```