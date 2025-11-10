import javax.swing.*;
import java.awt.*;

public class InputData {

    void main() {
        Font f1 = new Font("Pixeloid Sans", Font.BOLD, 28);
        UIManager.put("OptionPane.messageFont", f1);
        UIManager.put("Button.font", f1);
        UIManager.put("TextField.font",
                f1.deriveFont(Font.PLAIN, 24));
        UIManager.put("ComboBox.font", f1);

        JOptionPane.showMessageDialog(null,
                "Mi mensaje personalizado va aquí");

        int number = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un número:"));

        JOptionPane.showMessageDialog(null,
                "El número ingresado es: " + number);

        String[] options = {"Opción 1", "Opción 2", "Opción 3"};

        String selection = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción:",
                "Selector de Opciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        int select= JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción:",
                "Selector de Opciones",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
    }
}
