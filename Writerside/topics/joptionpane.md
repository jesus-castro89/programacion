# La libreria `JOptionPane`

`JOptionPane` es una clase en Java que proporciona una forma sencilla de crear cuadros de diálogo estándar para
interactuar con el usuario. Estos cuadros de diálogo pueden mostrar mensajes, solicitar entradas o presentar opciones
para que el usuario seleccione.

## Tipos de Cuadros de Diálogo

### Cuadro de Mensaje

Se utiliza para mostrar información al usuario.

```java
import javax.swing.JOptionPane;

public class MessageDialogExample {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Este es un cuadro de mensaje.");
    }
}
```

### Cuadro de Entrada

Se utiliza para solicitar al usuario que ingrese datos.

```java
import javax.swing.JOptionPane;

public class InputDialogExample {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        System.out.println("Hola, " + nombre + "!");
    }
}
```

En este caso siempre regresará un `String` o `null` si el usuario cancela el cuadro de diálogo.

Tambien es posible solicitar otros tipos de datos, como números enteros o flotantes, pero se debe convertir el `String`
devuelto por el cuadro de diálogo, como en el caso de los números enteros:

```java
import javax.swing.JOptionPane;

public class InputDialogIntegerExample {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese su edad:");
        if (input != null) {
            try {
                int edad = Integer.parseInt(input);
                System.out.println("Usted tiene " + edad + " años.");
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }
}
```

### Cuadro de Confirmación

Se utiliza para solicitar al usuario que confirme una acción, generalmente con opciones como "Sí", "No" o "Cancelar".

```java
import javax.swing.JOptionPane;

public class ConfirmDialogExample {
    public static void main(String[] args) {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            System.out.println("El usuario eligió Sí.");
        } else {
            System.out.println("El usuario eligió No.");
        }
    }
}
```

### Cuadro de Opciones

Se utiliza para presentar al usuario una lista de opciones para elegir.

```java
import javax.swing.JOptionPane;

public class OptionDialogExample {
    public static void main(String[] args) {
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Opciones",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        System.out.println("El usuario seleccionó: " + opciones[seleccion]);
    }
}
```

## Personalización de Cuadros de Diálogo

`JOptionPane` permite personalizar varios aspectos de los cuadros de diálogo usando la clase `UIManager`. Puedes cambiar
colores, fuentes y otros elementos visuales para que se adapten al estilo de tu
aplicación.

Las siguientes son algunas de las claves que puedes usar con `UIManager` para personalizar los cuadros de diálogo:

| Clave                          | Descripción                          |
|--------------------------------|--------------------------------------|
| `OptionPane.background`        | Color de fondo del cuadro de diálogo |
| `OptionPane.messageForeground` | Color del texto del mensaje          |
| `OptionPane.buttonFont`        | Fuente de los botones                |   
| `OptionPane.messageFont`       | Fuente del mensaje                   |
| `TextField.font`               | Fuente del campo de texto            |
| `ComboBox.font`                | Fuente del cuadro combinado          |

Aquí tienes un ejemplo de cómo personalizar el color de fondo y la fuente del mensaje:

```java
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;

public class CustomDialogExample {
    public static void main(String[] args) {
        // Personalizar el color de fondo y la fuente del mensaje
        UIManager.put("OptionPane.background", Color.LIGHT_GRAY);
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
        UIManager.put("OptionPane.messageForeground", Color.BLUE);
        UIManager.put("TextField.font", new Font("Arial", Font.PLAIN, 12));
        UIManager.put("ComboBox.font", new Font("Arial", Font.PLAIN, 12));

        JOptionPane.showMessageDialog(null, "Este es un cuadro de diálogo personalizado.");
    }
}
```
