# Las librerías propias en Java

En Java, además de las librerías estándar proporcionadas por el lenguaje, los desarrolladores pueden crear sus propias
librerías para reutilizar código y organizar mejor sus proyectos. Una librería propia es simplemente un conjunto de
clases y métodos que se agrupan en un paquete específico.

## Creación de una Librería Propia

Para crear una librería propia en Java, sigue estos pasos:

1. **Definir el Paquete**: Crea un paquete para tu librería. Esto ayuda a organizar las clases y evitar conflictos de
   nombres.
   ```java
   package miLibreria;
   ```
2. **Crear Clases y Métodos**: Define las clases y métodos que formarán parte de tu librería.
   ```java
    public class Utilidades {
        public static int sumar(int a, int b) {
            return a + b;
        }

        public static int restar(int a, int b) {
            return a - b;
        }
    }
    ```
3. **Importar la Librería**: Para utilizar tu librería en otro proyecto, importa el paquete correspondiente.
   ```java
   import miLibreria.Utilidades;
   ```
4. **Usar los Métodos de la Librería**: Ahora puedes llamar a los métodos definidos en tu librería.
   ```java
    import miLibreria.Utilidades;
   
    public class Main {
        void main() {
            int resultadoSuma = Utilidades.sumar(5, 3);
            int resultadoResta = Utilidades.restar(10, 4);
            IO.println("Resultado de la suma: " + resultadoSuma);
            IO.println("Resultado de la resta: " + resultadoResta);
        }
    }
    ```

## Ventajas de Usar Librerías Propias

- **Reutilización de Código**: Permite reutilizar código en diferentes proyectos sin necesidad de copiar y pegar.
- **Organización**: Ayuda a mantener el código organizado y modular.
- **Mantenimiento**: Facilita el mantenimiento y la actualización del código, ya que los cambios se realizan en un solo
  lugar.