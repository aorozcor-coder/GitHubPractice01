import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            byte numero;
            String cosa = "";
        System.out.println("Inicio de Proyecto Adrian felipe orozco romero");
             numero = entrada.nextByte();
             cosa = entrada.next();
            for (int i = 0; i <= numero; i++ ){
                System.out.println(i + cosa);

            }
    }
}