import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.*;

public class RandomNumber {

    void main() {
        UIManager.put("OptionPane.messageFont",
                new Font("Super Joyful", Font.BOLD, 32));
        UIManager.put("OptionPane.messageForeground",
                new Color(77, 132, 227, 255));
        UIManager.put("OptionPane.buttonFont",
                new Font("Arial", Font.BOLD, 28));
        UIManager.put("TextField.font",
                new Font("Arial", Font.PLAIN, 28));
        UIManager.put("OptionPane.buttonForeground",
                java.awt.Color.RED);
        UIManager.put("ComboBox.font",
                new Font("Arial", Font.PLAIN, 28));
        JOptionPane.showMessageDialog(null,
                "Aquí va tu mensaje");
        String[] options = {"Opción 1", "Opción 2", "Opción 3"};
        String choice = (String) JOptionPane.showInputDialog(null,
                "Elige una opción:",
                "Selector de opciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        JOptionPane.showMessageDialog(null,
                "Has elegido: " + choice);
        String input = JOptionPane.showInputDialog("Ingresa un número entero:");
    }
}
