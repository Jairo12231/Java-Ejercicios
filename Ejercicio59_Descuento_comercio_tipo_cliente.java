import java.util.Scanner;

// 59 Descuento comercio tipo cliente
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio59_Descuento_comercio_tipo_cliente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int C = 0;
        double D = 0;
        double F = 0;
        double M = 0;

        System.out.println("Tipo de cliente (1 = Estudiante, 2 = Empleado, 3 = General):");
        C = Integer.parseInt(entrada.nextLine().trim());
        System.out.println("Ingrese el monto de compra:");
        M = Double.parseDouble(entrada.nextLine().trim());
        if ((((C >= 1)) && ((C <= 3)) && ((M > 0)))) {
            if (((C == 1))) {
                D = 0.15;
            } else {
                if (((C == 2))) {
                    D = 0.1;
                } else {
                    D = 0;
                }
            }
            if (((M > 50))) {
                D = (D + 0.05);
            }
            F = (M * (1 - D));
            System.out.println("Descuento aplicado: " + "" + String.valueOf((D * 100)) + "" + "%");
            System.out.println("Total a pagar: $" + "" + String.valueOf(F));
        } else {
            System.out.println("Tipo de cliente o monto no valido");
        }
    }
}
