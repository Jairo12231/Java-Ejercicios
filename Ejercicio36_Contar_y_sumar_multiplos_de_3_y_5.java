import java.util.Scanner;

// 36 Contar y sumar multiplos de 3 y 5
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio36_Contar_y_sumar_multiplos_de_3_y_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int C = 0;
        int I = 0;
        int N = 0;
        int S = 0;

        System.out.println("Ingrese N:");
        N = Integer.parseInt(entrada.nextLine().trim());
        C = 0;
        S = 0;
        for (I = (int) (1); I < ((int) (N) + 1); I += 1) {
            if (((((I % 3) == 0)) || (((I % 5) == 0)))) {
                C = (C + 1);
                S = (S + I);
            }
        }
        System.out.println("Cantidad de multiplos: " + "" + String.valueOf(C));
        System.out.println("Suma de multiplos: " + "" + String.valueOf(S));
    }
}
