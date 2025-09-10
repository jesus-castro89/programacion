# La función main

Para el lenguaje de programación **Java**, la función principal es el punto de entrada de cualquier programa. Es donde
comienza la ejecución del código. La función principal en Java se define dentro de una clase y tiene la siguiente firma:

```java
public static void main(String[] args) {
    // Código a ejecutar
}
```

### Desglose de la firma de la función main:

- `public`: Es un modificador de acceso que indica que la función puede ser llamada desde cualquier otra clase.
- `static`: Indica que la función pertenece a la clase y no a una instancia específica de la clase. Esto permite que la
  función sea llamada sin necesidad de crear un objeto de la clase.
- `void`: Indica que la función no devuelve ningún valor.
- `main`: Es el nombre de la función. Este nombre es especial y es reconocido por la máquina virtual de Java (JVM) como
  el punto de entrada del programa.
- `String[] args`: Es un parámetro que recibe un arreglo de cadenas de texto (strings). Este arreglo puede contener
  argumentos que se pasan al programa desde la línea de comandos cuando se ejecuta.