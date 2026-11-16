import java.util.Scanner;

// 11 pseudocodigo para calcular la longitud y el area de una circuferencia
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio11_pseudocodigo_para_calcular_la_longitud_y_el_area_de_una_circuferencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A = 0;
        double L = 0;
        double R = 0;

        System.out.println("Ingresar el radio:");
        R = Double.parseDouble(entrada.nextLine().trim());
        L = ((2 * 3.14159265) * R);
        A = (3.14159265 * Math.pow(R, 2));
        System.out.println("La longitud es:" + "" + String.valueOf(L));
        System.out.println("El area del circulo es:" + "" + String.valueOf(A));
    }
}
