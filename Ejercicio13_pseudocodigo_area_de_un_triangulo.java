import java.util.Scanner;

// 13 pseudocodigo area de un triangulo
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio13_pseudocodigo_area_de_un_triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A = 0;
        double B = 0;
        double H = 0;

        System.out.println("Ingresar la base:");
        B = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingresar la altura:");
        H = Double.parseDouble(entrada.nextLine().trim());
        A = ((double) ((B * H)) / (2));
        System.out.println("La area del triangulo es:" + "" + String.valueOf(A));
    }
}
