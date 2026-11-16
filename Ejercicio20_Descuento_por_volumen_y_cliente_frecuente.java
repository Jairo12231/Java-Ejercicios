import java.util.Scanner;

// 20 Descuento por volumen y cliente frecuente
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio20_Descuento_por_volumen_y_cliente_frecuente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double D = 0;
        String F = "";
        double M = 0;
        int P = 0;
        double T = 0;

        System.out.println("Ingrese el monto de compra:");
        M = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Es cliente frecuente? (S/N):");
        F = entrada.nextLine();
        if ((((M < 0)) || ((!(F.equals("S"))) && (!(F.equals("s"))) && (!(F.equals("N"))) && (!(F.equals("n")))))) {
            System.out.println("Datos no validos");
        } else {
            if (((M >= 500))) {
                P = 15;
            } else {
                if (((M >= 300))) {
                    P = 10;
                } else {
                    if (((M >= 100))) {
                        P = 5;
                    } else {
                        P = 0;
                    }
                }
            }
            if ((((F.equals("S"))) || ((F.equals("s"))))) {
                P = (P + 5);
            }
            D = ((double) ((M * P)) / (100));
            T = (M - D);
            System.out.println("Porcentaje de descuento: " + "" + String.valueOf(P) + "" + "%");
            System.out.println("Descuento: $" + "" + String.valueOf(D));
            System.out.println("Total a pagar: $" + "" + String.valueOf(T));
        }
    }
}
