import java.util.Scanner;

// 32 Tipo de ecuacion cuadratica
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio32_Tipo_de_ecuacion_cuadratica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A = 0;
        double B = 0;
        double C = 0;
        double D = 0;

        System.out.println("Ingrese el coeficiente A:");
        A = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el coeficiente B:");
        B = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el coeficiente C:");
        C = Double.parseDouble(entrada.nextLine().trim());
        if (((A == 0))) {
            System.out.println("No es una ecuacion cuadratica");
        } else {
            D = (Math.pow(B, 2) - ((4 * A) * C));
            if (((D > 0))) {
                System.out.println("Tiene dos soluciones reales");
            } else {
                if (((D == 0))) {
                    System.out.println("Tiene una solucion real");
                } else {
                    System.out.println("No tiene soluciones reales");
                }
            }
        }
    }
}
