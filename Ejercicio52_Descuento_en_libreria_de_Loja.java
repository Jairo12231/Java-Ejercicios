import java.util.Scanner;

// 52 Descuento en libreria de Loja
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio52_Descuento_en_libreria_de_Loja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int D = 0;
        String E = "";
        double M = 0;
        double T = 0;

        System.out.println("Es estudiante UTPL? (S/N):");
        E = entrada.nextLine();
        System.out.println("Monto de compra:");
        M = Double.parseDouble(entrada.nextLine().trim());
        if ((((M < 0)) || ((!(E.equals("S"))) && (!(E.equals("N"))) && (!(E.equals("s"))) && (!(E.equals("n")))))) {
            System.out.println("Datos invalidos");
        } else {
            D = 0;
            if ((((E.equals("S"))) || ((E.equals("s"))))) {
                D = 20;
                if (((M > 30))) {
                    D = (D + 5);
                }
            } else {
                if (((M > 50))) {
                    D = 10;
                }
            }
            T = (M * (1 - ((double) (D) / (100))));
            System.out.println("Descuento aplicado: " + "" + String.valueOf(D) + "" + "%");
            System.out.println("Total a pagar: $" + "" + String.valueOf(T));
        }
    }
}
