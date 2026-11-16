import java.util.Scanner;

// 09 pseudocodigo Conversion de dolares a pesos mexicanos
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio09_pseudocodigo_Conversion_de_dolares_a_pesos_mexicanos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double C = 0;
        double D = 0;
        double P = 0;

        System.out.println("Ingrese la cantidad en dolares:");
        D = Double.parseDouble(entrada.nextLine().trim());
        while (((D < 0))) {
            System.out.println("La cantidad no puede ser negativa");
            System.out.println("Ingrese la cantidad en dolares:");
            D = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese el valor de pesos por dolar:");
        C = Double.parseDouble(entrada.nextLine().trim());
        while (((C <= 0))) {
            System.out.println("El tipo de cambio debe ser mayor que 0");
            System.out.println("Ingrese el valor de pesos por dolar:");
            C = Double.parseDouble(entrada.nextLine().trim());
        }
        P = (D * C);
        System.out.println("La cantidad equivalente en pesos mexicanos es: " + "" + String.valueOf(P));
    }
}
