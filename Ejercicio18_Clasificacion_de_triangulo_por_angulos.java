import java.util.Scanner;

// 18 Clasificacion de triangulo por angulos
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio18_Clasificacion_de_triangulo_por_angulos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A1 = 0;
        double A2 = 0;
        double A3 = 0;
        double MAY = 0;
        double SUMA = 0;

        System.out.println("Ingrese el primer angulo:");
        A1 = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el segundo angulo:");
        A2 = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el tercer angulo:");
        A3 = Double.parseDouble(entrada.nextLine().trim());
        SUMA = ((A1 + A2) + A3);
        if ((((A1 <= 0)) || ((A2 <= 0)) || ((A3 <= 0)) || ((SUMA != 180)))) {
            System.out.println("Error: los angulos no forman un triangulo");
        } else {
            MAY = A1;
            if (((A2 > MAY))) {
                MAY = A2;
            }
            if (((A3 > MAY))) {
                MAY = A3;
            }
            if (((MAY < 90))) {
                System.out.println("El triangulo es acutangulo");
            } else {
                if (((MAY == 90))) {
                    System.out.println("El triangulo es rectangulo");
                } else {
                    System.out.println("El triangulo es obtusangulo");
                }
            }
        }
    }
}
