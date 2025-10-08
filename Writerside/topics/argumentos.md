# Funciones con y sin argumentos

Dentro de la programación en Java, las funciones (o métodos) pueden definirse con o sin argumentos. Los argumentos son
valores que se pasan a una función para que ésta pueda utilizarlos en su ejecución. A continuación, se explica cómo
funcionan ambos tipos de funciones:

## Funciones sin Argumentos

Una función sin argumentos no recibe ningún valor cuando es llamada. Estas funciones suelen realizar tareas que no
requieren información externa para su ejecución.

```java
public class EjemploFunciones {
    // Función sin argumentos que imprime un mensaje
    public static void saludar() {
        System.out.println("¡Hola, bienvenido a Java!");
    }

    public static void main(String[] args) {
        // Llamada a la función sin argumentos
        saludar();
    }
}
```

En este ejemplo, la función `saludar` no recibe ningún argumento y simplemente imprime un mensaje en la consola.

## Funciones con Argumentos

Una función con argumentos recibe uno o más valores cuando es llamada. Estos valores pueden ser utilizados dentro de la
función para realizar cálculos o tomar decisiones.

```java
public class EjemploFunciones {
    // Función con argumentos que suma dos números y devuelve el resultado
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Llamada a la función con argumentos
        int resultado = sumar(5, 10);
        System.out.println("La suma es: " + resultado);
    }
}
```

En este ejemplo, la función `sumar` recibe dos argumentos (`a` y `b`), los suma y devuelve el resultado. Al llamar a la
función, se pasan los valores `5` y `10`, y el resultado de la suma se imprime en la consola.