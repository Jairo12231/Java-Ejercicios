import java.util.Scanner;

// 34 Ahorro con aportes variables
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio34_Ahorro_con_aportes_variables {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A = 0;
        int I = 0;
        int N = 0;
        double S = 0;

        System.out.println("Ingrese la cantidad de meses:");
        N = Integer.parseInt(entrada.nextLine().trim());
        if (((N <= 0))) {
            System.out.println("N debe ser mayor que cero");
        } else {
            S = 0;
            for (I = (int) (1); I < ((int) (N) + 1); I += 1) {
                System.out.println("Ingrese el aporte del mes " + "" + String.valueOf(I) + "" + ":");
                A = Double.parseDouble(entrada.nextLine().trim());
                if (((A < 0))) {
                    System.out.println("El aporte no puede ser negativo; se toma como 0");
                    A = 0;
                }
                S = ((S + A) * 1.008);
                System.out.println("Saldo del mes " + "" + String.valueOf(I) + "" + ": $" + "" + String.valueOf(S));
            }
            System.out.println("Saldo final: $" + "" + String.valueOf(S));
        }
    }
}
