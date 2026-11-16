import java.util.Scanner;

// 24 pseudocodigo Aprobacion de asignatura
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio24_pseudocodigo_Aprobacion_de_asignatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double P = 0;

        System.out.println("Ingrese el promedio final (0 a 10):");
        P = Double.parseDouble(entrada.nextLine().trim());
        while ((((P < 0)) || ((P > 10)))) {
            System.out.println("El promedio debe estar entre 0 y 10");
            System.out.println("Ingrese el promedio final (0 a 10):");
            P = Double.parseDouble(entrada.nextLine().trim());
        }
        if (((P >= 7))) {
            System.out.println("APRUEBA");
        } else {
            System.out.println("NO APRUEBA");
        }
    }
}
