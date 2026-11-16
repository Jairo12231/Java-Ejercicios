import java.util.Scanner;

// 05 Cuota de prestamo con interes simple
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio05_Cuota_de_prestamo_con_interes_simple {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double C = 0;
        double CU = 0;
        double IT = 0;
        int N = 0;
        double T = 0;

        System.out.println("Ingrese el capital:");
        C = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese la tasa anual en decimal:");
        T = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el plazo en meses:");
        N = Integer.parseInt(entrada.nextLine().trim());
        if ((((C < 0)) || ((T < 0)) || ((N <= 0)))) {
            System.out.println("Datos no validos");
        } else {
            IT = ((C * T) * ((double) (N) / (12)));
            CU = ((double) ((C + IT)) / (N));
            System.out.println("Interes total: $" + "" + String.valueOf(IT));
            System.out.println("Cuota mensual: $" + "" + String.valueOf(CU));
        }
    }
}
