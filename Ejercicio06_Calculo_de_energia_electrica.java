import java.util.Scanner;

// 06 Calculo de energia electrica
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio06_Calculo_de_energia_electrica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double CON = 0;
        double COS = 0;
        double HRS = 0;
        double POT = 0;
        double TAR = 0;

        System.out.println("Ingrese la potencia del electrodomestico en W:");
        POT = Double.parseDouble(entrada.nextLine().trim());
        while (((POT <= 0))) {
            System.out.println("La potencia debe ser mayor que 0");
            System.out.println("Ingrese la potencia del electrodomestico en W:");
            POT = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese las horas de uso diario (0 a 24):");
        HRS = Double.parseDouble(entrada.nextLine().trim());
        while ((((HRS < 0)) || ((HRS > 24)))) {
            System.out.println("Las horas deben estar entre 0 y 24");
            System.out.println("Ingrese las horas de uso diario (0 a 24):");
            HRS = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese la tarifa por kWh:");
        TAR = Double.parseDouble(entrada.nextLine().trim());
        while (((TAR < 0))) {
            System.out.println("La tarifa no puede ser negativa");
            System.out.println("Ingrese la tarifa por kWh:");
            TAR = Double.parseDouble(entrada.nextLine().trim());
        }
        CON = ((((double) (POT) / (1000)) * HRS) * 30);
        COS = (CON * TAR);
        System.out.println("Consumo mensual: " + "" + String.valueOf(CON) + "" + " kWh");
        System.out.println("Costo mensual: $" + "" + String.valueOf(COS));
    }
}
