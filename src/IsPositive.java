public class IsPositive {

    void main() {
        int number = Ejemplo.getNumber();
        if (number % 2 == 0) {
            IO.println("El número múltiplo de 2");
        } else if (number % 3 == 0) {
            IO.println("El número es múltiplo de 3");
        } else if (number % 5 == 0) {
            IO.println("El número es múltiplo de 5");
        } else {
            IO.println("El número no es múltiplo de 2, 3 o 5");
        }
    }
}
