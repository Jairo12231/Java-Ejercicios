import java.util.Scanner;

// 35 Ahorro con interes compuesto mensual
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio35_Ahorro_con_interes_compuesto_mensual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double CAP = 0;
        double DEP = 0;
        int MES = 0;
        int N = 0;
        double SAL = 0;
        double TASA = 0;

        System.out.println("Ingrese el capital inicial:");
        CAP = Double.parseDouble(entrada.nextLine().trim());
        while (((CAP < 0))) {
            System.out.println("El capital no puede ser negativo");
            System.out.println("Ingrese el capital inicial:");
            CAP = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese el deposito mensual:");
        DEP = Double.parseDouble(entrada.nextLine().trim());
        while (((DEP < 0))) {
            System.out.println("El deposito no puede ser negativo");
            System.out.println("Ingrese el deposito mensual:");
            DEP = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese el numero de meses:");
        N = Integer.parseInt(entrada.nextLine().trim());
        while (((N <= 0))) {
            System.out.println("El numero de meses debe ser mayor que 0");
            System.out.println("Ingrese el numero de meses:");
            N = Integer.parseInt(entrada.nextLine().trim());
        }
        System.out.println("Ingrese la tasa mensual de interes (%):");
        TASA = Double.parseDouble(entrada.nextLine().trim());
        while (((TASA < 0))) {
            System.out.println("La tasa no puede ser negativa");
            System.out.println("Ingrese la tasa mensual de interes (%):");
            TASA = Double.parseDouble(entrada.nextLine().trim());
        }
        SAL = CAP;
        for (MES = (int) (1); MES < ((int) (N) + 1); MES += 1) {
            SAL = (SAL + DEP);
            SAL = (SAL * (1 + ((double) (TASA) / (100))));
            System.out.println("Saldo al finalizar el mes " + "" + String.valueOf(MES) + "" + ": $" + "" + String.valueOf(SAL));
        }
        System.out.println("Saldo final: $" + "" + String.valueOf(SAL));
    }
}
