import java.util.Scanner;

// 30 Sistema de tarifas de taxi
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio30_Sistema_de_tarifas_de_taxi {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double KM = 0;
        String NOC = "";
        double TAR = 0;
        double TOT = 0;

        System.out.println("Ingrese la distancia del viaje en km:");
        KM = Double.parseDouble(entrada.nextLine().trim());
        while (((KM < 0))) {
            System.out.println("La distancia no puede ser negativa");
            System.out.println("Ingrese la distancia del viaje en km:");
            KM = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Es de noche? Ingrese S o N:");
        NOC = entrada.nextLine();
        while (((!(NOC.equals("S"))) && (!(NOC.equals("N"))))) {
            System.out.println("Debe ingresar S o N");
            System.out.println("Es de noche? Ingrese S o N:");
            NOC = entrada.nextLine();
        }
        TAR = (2 + (1.5 * KM));
        TOT = TAR;
        if (((KM > 10))) {
            TOT = (TOT + (TOT * 0.2));
        }
        if (((NOC.equals("S")))) {
            TOT = (TOT + (TOT * 0.3));
        }
        System.out.println("Total a pagar: $" + "" + String.valueOf(TOT));
    }
}
