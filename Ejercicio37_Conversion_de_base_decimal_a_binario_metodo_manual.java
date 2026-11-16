import java.util.Scanner;

// 37 Conversion de base decimal a binario metodo manual
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio37_Conversion_de_base_decimal_a_binario_metodo_manual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String BIN = "";
        int NUM = 0;
        int RES = 0;

        System.out.println("Ingrese un numero entero decimal no negativo:");
        NUM = Integer.parseInt(entrada.nextLine().trim());
        while (((NUM < 0))) {
            System.out.println("El numero debe ser no negativo");
            System.out.println("Ingrese un numero entero decimal no negativo:");
            NUM = Integer.parseInt(entrada.nextLine().trim());
        }
        BIN = "";
        if (((NUM == 0))) {
            BIN = "0";
        } else {
            while (((NUM > 0))) {
                RES = (NUM % 2);
                BIN = (String.valueOf(String.valueOf(RES)) + String.valueOf(BIN));
                NUM = (int) (((double) (NUM) / (2)));
            }
        }
        System.out.println("Representacion binaria: " + "" + BIN);
    }
}
