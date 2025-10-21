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

## Ejemplos Comunes de Funciones Recursivas

1. **Factorial**: Calcula el factorial de un número entero positivo.
2. **Fibonacci**: Calcula el n-ésimo número en la secuencia de Fibonacci.
3. **Búsqueda Binaria**: Busca un elemento en una lista ordenada dividiendo repetidamente el rango de búsqueda a la
   mitad.

## Preguntas para aplicar Recursividad

1. ¿El problema puede ser dividido en subproblemas más pequeños y similares?
2. ¿Existe un caso base claro que detenga la recursión?
3. ¿La solución recursiva es más sencilla o más eficiente que una solución iterativa?
4. ¿Cómo manejarás los casos de entrada que podrían causar una recursión profunda o infinita?

Si alguna de estas preguntas no tiene una respuesta afirmativa clara, es posible que la recursividad no sea la mejor
solución para el problema en cuestión.

## Ventajas y Desventajas de la Recursividad

### Ventajas

- Código más limpio y fácil de entender para problemas que tienen una naturaleza recursiva.
- Puede simplificar la solución de problemas complejos.
- Facilita la implementación de algoritmos que trabajan con estructuras de datos recursivas.

### Desventajas

- Puede ser menos eficiente en términos de uso de memoria y tiempo de ejecución debido a las llamadas de función
  adicionales.
- Riesgo de desbordamiento de pila si la recursión es demasiado profunda.
- A veces, una solución iterativa puede ser más eficiente.

## Consideraciones al Usar Recursividad

- Asegúrate de definir un caso base claro para evitar recursiones infinitas.
- Evalúa si la recursividad es la mejor solución para el problema en cuestión.
- Considera el uso de técnicas como la memorización o la recursión de cola para optimizar el rendimiento en casos
  específicos.
- Prueba tus funciones recursivas con diferentes entradas para asegurarte de que funcionan correctamente en todos los
  casos.