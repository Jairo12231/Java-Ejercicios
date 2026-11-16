import java.util.Scanner;

// 07 Hipotenusa y area de un triangulo rectangulo
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio07_Hipotenusa_y_area_de_un_triangulo_rectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A = 0;
        double AR = 0;
        double B = 0;
        double H = 0;

        System.out.println("Ingrese el primer cateto:");
        A = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el segundo cateto:");
        B = Double.parseDouble(entrada.nextLine().trim());
        if ((((A <= 0)) || ((B <= 0)))) {
            System.out.println("Los catetos deben ser mayores que cero");
        } else {
            H = Math.sqrt((Math.pow(A, 2) + Math.pow(B, 2)));
            AR = ((double) ((A * B)) / (2));
            System.out.println("Hipotenusa: " + "" + String.valueOf(H));
            System.out.println("Area: " + "" + String.valueOf(AR));
        }
    }
}
