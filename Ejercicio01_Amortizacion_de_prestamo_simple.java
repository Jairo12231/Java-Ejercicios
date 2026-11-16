import java.util.Scanner;

// 01 Amortizacion de prestamo simple
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio01_Amortizacion_de_prestamo_simple {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double CUO = 0;
        double INT = 0;
        int MES = 0;
        double MON = 0;
        double TASA = 0;

        System.out.println("Ingrese el monto del prestamo:");
        MON = Double.parseDouble(entrada.nextLine().trim());
        while (((MON <= 0))) {
            System.out.println("El monto debe ser mayor que 0");
            System.out.println("Ingrese el monto del prestamo:");
            MON = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese la tasa de interes mensual (%):");
        TASA = Double.parseDouble(entrada.nextLine().trim());
        while (((TASA < 0))) {
            System.out.println("La tasa no puede ser negativa");
            System.out.println("Ingrese la tasa de interes mensual (%):");
            TASA = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese el numero de meses:");
        MES = Integer.parseInt(entrada.nextLine().trim());
        while (((MES <= 0))) {
            System.out.println("El numero de meses debe ser mayor que 0");
            System.out.println("Ingrese el numero de meses:");
            MES = Integer.parseInt(entrada.nextLine().trim());
        }
        INT = ((MON * ((double) (TASA) / (100))) * MES);
        CUO = ((double) ((MON + INT)) / (MES));
        System.out.println("Interes total: $" + "" + String.valueOf(INT));
        System.out.println("Cuota mensual: $" + "" + String.valueOf(CUO));
    }
}
