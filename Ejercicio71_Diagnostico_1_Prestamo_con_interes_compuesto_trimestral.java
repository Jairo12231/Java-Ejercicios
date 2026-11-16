import java.util.Scanner;

// 71 Diagnostico 1 Prestamo con interes compuesto trimestral
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio71_Diagnostico_1_Prestamo_con_interes_compuesto_trimestral {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A = 0;
        double B = 0;
        double F = 0;
        double M = 0;
        int N = 0;
        double P = 0;
        double T = 0;

        System.out.println("Monto del prestamo:");
        P = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Tasa trimestral en decimal (ej. 0.03):");
        T = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Numero de trimestres:");
        N = Integer.parseInt(entrada.nextLine().trim());
        System.out.println("Porcentaje de abono extraordinario (0 a 100):");
        B = Double.parseDouble(entrada.nextLine().trim());
        if ((((P <= 0)) || ((T < 0)) || ((N < 0)) || ((B < 0)) || ((B > 100)))) {
            System.out.println("Datos invalidos");
        } else {
            M = (P * Math.pow((1 + T), N));
            A = ((double) ((M * B)) / (100));
            F = (M - A);
            System.out.println("Monto antes del abono: $" + "" + String.valueOf(M));
            System.out.println("Abono extraordinario: $" + "" + String.valueOf(A));
            System.out.println("Monto final a cancelar: $" + "" + String.valueOf(F));
        }
    }
}
