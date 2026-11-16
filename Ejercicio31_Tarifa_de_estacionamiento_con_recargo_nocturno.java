import java.util.Scanner;

// 31 Tarifa de estacionamiento con recargo nocturno
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio31_Tarifa_de_estacionamiento_con_recargo_nocturno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double H = 0;
        String N = "";
        double T = 0;
        double TB = 0;

        System.out.println("Ingrese las horas de estacionamiento:");
        H = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Es horario nocturno? (S/N):");
        N = entrada.nextLine();
        if ((((H < 0)) || ((!(N.equals("S"))) && (!(N.equals("s"))) && (!(N.equals("N"))) && (!(N.equals("n")))))) {
            System.out.println("Datos no validos");
        } else {
            TB = (H * 1.5);
            T = TB;
            if (((H > 8))) {
                T = (T * 1.25);
            }
            if ((((N.equals("S"))) || ((N.equals("s"))))) {
                T = (T * 1.3);
            }
            System.out.println("Tarifa base: $" + "" + String.valueOf(TB));
            System.out.println("Total a pagar: $" + "" + String.valueOf(T));
        }
    }
}
