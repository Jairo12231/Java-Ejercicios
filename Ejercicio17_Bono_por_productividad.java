import java.util.Scanner;

// 17 Bono por productividad
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio17_Bono_por_productividad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double BONO = 0;
        int PB = 0;
        double PRO = 0;
        double SB = 0;
        double TOT = 0;

        System.out.println("Ingrese el sueldo base:");
        SB = Double.parseDouble(entrada.nextLine().trim());
        while (((SB < 0))) {
            System.out.println("El sueldo base no puede ser negativo");
            System.out.println("Ingrese el sueldo base:");
            SB = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese el porcentaje de productividad (0 a 100):");
        PRO = Double.parseDouble(entrada.nextLine().trim());
        while ((((PRO < 0)) || ((PRO > 100)))) {
            System.out.println("La productividad debe estar entre 0 y 100");
            System.out.println("Ingrese el porcentaje de productividad (0 a 100):");
            PRO = Double.parseDouble(entrada.nextLine().trim());
        }
        if (((PRO >= 90))) {
            PB = 20;
        } else {
            if (((PRO >= 70))) {
                PB = 10;
            } else {
                if (((PRO >= 50))) {
                    PB = 5;
                } else {
                    PB = 0;
                }
            }
        }
        BONO = (SB * ((double) (PB) / (100)));
        TOT = (SB + BONO);
        System.out.println("Porcentaje de bono aplicado: " + "" + String.valueOf(PB) + "" + "%");
        System.out.println("Bono: $" + "" + String.valueOf(BONO));
        System.out.println("Total a pagar: $" + "" + String.valueOf(TOT));
    }
}
