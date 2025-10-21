public class Product {

    public static boolean esMultiDeTres(){

        int numero = Integer.parseInt(
                IO.readln("Ingrese un número entero: "));
        return numero % 3 == 0;
    }

    void main(){
        if(esMultiDeTres()){
            IO.println("El número es múltiplo de 3");
        } else {
            IO.println("El número no es múltiplo de 3");
        }
    }
}
