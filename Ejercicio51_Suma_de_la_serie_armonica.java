import java.util.Scanner;

// 51 Suma de la serie armonica
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio51_Suma_de_la_serie_armonica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int I = 0;
        int N = 0;
        double S = 0;

        System.out.println("Ingrese N:");
        N = Integer.parseInt(entrada.nextLine().trim());
        if (((N <= 0))) {
            System.out.println("N debe ser mayor que cero");
        } else {
            S = 0;
            for (I = (int) (1); I < ((int) (N) + 1); I += 1) {
                S = (S + ((double) (1) / (I)));
            }
            System.out.println("Suma de la serie: " + "" + String.valueOf(S));
        }
    }
}
