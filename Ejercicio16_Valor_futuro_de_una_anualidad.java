import java.util.Scanner;

// 16 Valor futuro de una anualidad
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio16_Valor_futuro_de_una_anualidad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double D = 0;
        double I = 0;
        int N = 0;
        double TT = 0;
        double VF = 0;

        System.out.println("Ingrese el deposito mensual:");
        D = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese la tasa mensual en decimal:");
        I = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el numero de meses:");
        N = Integer.parseInt(entrada.nextLine().trim());
        TT = (D * N);
        if ((((N <= 0)) || ((D < 0)) || ((I < 0)))) {
            System.out.println("Datos no validos");
        } else {
            if (((I == 0))) {
                VF = TT;
            } else {
                VF = (D * ((double) ((Math.pow((1 + I), N) - 1)) / (I)));
            }
            System.out.println("Total depositado: $" + "" + String.valueOf(TT));
            System.out.println("Valor futuro: $" + "" + String.valueOf(VF));
        }
    }
}
