import java.util.Scanner;

// 02 Conversion de coordenadas polares a cartesianas
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio02_Conversion_de_coordenadas_polares_a_cartesianas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double G = 0;
        double R = 0;
        double RAD = 0;
        double X = 0;
        double Y = 0;

        System.out.println("Ingrese el radio:");
        R = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el angulo en grados:");
        G = Double.parseDouble(entrada.nextLine().trim());
        RAD = ((double) ((G * 3.14159265)) / (180));
        X = (R * Math.cos(RAD));
        Y = (R * Math.sin(RAD));
        System.out.println("Coordenada X: " + "" + String.valueOf(X));
        System.out.println("Coordenada Y: " + "" + String.valueOf(Y));
    }
}
