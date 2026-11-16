import java.util.Scanner;

// 40 Inversion de un numero
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio40_Inversion_de_un_numero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int D = 0;
        int INV = 0;
        int N = 0;
        int T = 0;

        System.out.println("Ingrese un numero entero positivo:");
        N = Integer.parseInt(entrada.nextLine().trim());
        if (((N <= 0))) {
            System.out.println("El numero debe ser positivo");
        } else {
            T = N;
            INV = 0;
            while (((T > 0))) {
                D = (T % 10);
                INV = ((INV * 10) + D);
                T = (int) (((double) (T) / (10)));
            }
            System.out.println("Numero invertido: " + "" + String.valueOf(INV));
        }
    }
}
