import java.util.Scanner;

// 12 pseudocodigo producto su suma y media Aritmetica
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio12_pseudocodigo_producto_su_suma_y_media_Aritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double M = 0;
        double N1 = 0;
        double N2 = 0;
        double N3 = 0;
        double N4 = 0;
        double P = 0;
        double S = 0;

        System.out.println("Ingrese el primer numero");
        N1 = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el segundo numero");
        N2 = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el trecer numero");
        N3 = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el cuarto numero");
        N4 = Double.parseDouble(entrada.nextLine().trim());
        S = (((N1 + N2) + N3) + N4);
        P = (((N1 * N2) * N3) * N4);
        M = ((double) (S) / (4));
        System.out.println("La suma es:" + "" + String.valueOf(S));
        System.out.println("Es producto es:" + "" + String.valueOf(P));
        System.out.println("La media aritmetica es:" + "" + String.valueOf(M));
    }
}
