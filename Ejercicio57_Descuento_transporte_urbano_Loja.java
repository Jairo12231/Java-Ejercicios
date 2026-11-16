import java.util.Scanner;

// 57 Descuento transporte urbano Loja
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio57_Descuento_transporte_urbano_Loja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double D = 0;
        int E = 0;
        double F = 0;
        int H = 0;
        double T = 0;

        System.out.println("Es estudiante? (1 = Si, 0 = No):");
        E = Integer.parseInt(entrada.nextLine().trim());
        System.out.println("Ingrese la hora del viaje (0 a 23):");
        H = Integer.parseInt(entrada.nextLine().trim());
        System.out.println("Ingrese la tarifa base:");
        T = Double.parseDouble(entrada.nextLine().trim());
        if (((((E == 0)) || ((E == 1))) && (((H >= 0)) && ((H <= 23))) && ((T >= 0)))) {
            D = 0;
            if (((E == 1))) {
                D = 0.3;
                if ((((H >= 9)) && ((H <= 16)))) {
                    D = (D + 0.1);
                }
            } else {
                if ((((H >= 9)) && ((H <= 16)))) {
                    D = 0.1;
                }
            }
            F = (T * (1 - D));
            System.out.println("Descuento aplicado: " + "" + String.valueOf((D * 100)) + "" + "%");
            System.out.println("Tarifa final: $" + "" + String.valueOf(F));
        } else {
            System.out.println("Datos no validos");
        }
    }
}
