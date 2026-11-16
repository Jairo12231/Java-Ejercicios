import java.util.Scanner;

// 14 pseudocodigo Area y perimetro de un rectangulo
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio14_pseudocodigo_Area_y_perimetro_de_un_rectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A = 0;
        double AREA = 0;
        double L = 0;
        double P = 0;

        System.out.println("Ingrese el largo del rectangulo en metros:");
        L = Double.parseDouble(entrada.nextLine().trim());
        while (((L <= 0))) {
            System.out.println("El largo debe ser mayor que 0");
            System.out.println("Ingrese el largo del rectangulo en metros:");
            L = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese el ancho del rectangulo en metros:");
        A = Double.parseDouble(entrada.nextLine().trim());
        while (((A <= 0))) {
            System.out.println("El ancho debe ser mayor que 0");
            System.out.println("Ingrese el ancho del rectangulo en metros:");
            A = Double.parseDouble(entrada.nextLine().trim());
        }
        AREA = (L * A);
        P = (2 * (L + A));
        System.out.println("El area del rectangulo es: " + "" + String.valueOf(AREA) + "" + " metros cuadrados");
        System.out.println("El perimetro del rectangulo es: " + "" + String.valueOf(P) + "" + " metros");
    }
}
