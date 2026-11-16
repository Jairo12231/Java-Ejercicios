import java.util.Scanner;

// 25 pseudocodigo Descuento segun monto de compra
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio25_pseudocodigo_Descuento_segun_monto_de_compra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double C = 0;
        double D = 0;
        double P = 0;
        double P1 = 0;
        double PF = 0;

        System.out.println("Ingrese el monto de la compra:");
        C = Double.parseDouble(entrada.nextLine().trim());
        while (((C < 0))) {
            System.out.println("El monto no puede ser negativo");
            System.out.println("Ingrese el monto de la compra:");
            C = Double.parseDouble(entrada.nextLine().trim());
        }
        if (((C >= 200))) {
            P = 0.15;
        } else {
            if (((C >= 100))) {
                P = 0.1;
            } else {
                P = 0.05;
            }
        }
        D = (C * P);
        P1 = (P * 100);
        PF = (C - D);
        System.out.println("Descuento aplicado: " + "" + String.valueOf(P1) + "" + "%");
        System.out.println("Monto a pagar: $" + "" + String.valueOf(PF));
    }
}
