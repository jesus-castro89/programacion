public class Ejemplo {

    void main() {

        int valor = Integer.parseInt(
                IO.readln("Ingresa un valor entero"));
        String coso;
        if (valor > 0 && valor < 10) {
            coso = "Valor pequeño positivo";
        } else if (valor >= 10 && valor < 100) {
            coso = "Valor mediano positivo";
        } else if (valor >= 100) {
            coso = "Valor grande positivo";
        }
    }
}