import javax.swing.*;

public class IsPositive {

    public static int getIntInput(String message) {
        String input;
        do {
            input = JOptionPane.showInputDialog(message);
            if (!input.matches("^-?\\d+$")) {
                JOptionPane.showMessageDialog(null,
                        "Ingrese solo números enteros",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while (!input.matches("^-?\\d+$"));
        return Integer.parseInt(input);
    }
}
