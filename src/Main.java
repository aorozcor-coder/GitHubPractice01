import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            byte numero;
            String thing;
        System.out.println("Inicio de Proyecto Adrian felipe orozco romero");
             numero = entrada.nextByte();
             thing = entrada.next();
            for (int i = 0; i <= numero; i++ ){
                System.out.println(i + thing);

            if (numero < 10 && numero > 0){
                System.out.println("El numero es menor a 10 y mayor a 0");
            }
            }
    }
}