import java.util.Scanner;

// 47 pseudocodigo Promedio de N notas
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio47_pseudocodigo_Promedio_de_N_notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int I = 0;
        int N = 0;
        double NOTA = 0;
        double P = 0;
        double SUMA = 0;

        System.out.println("Ingrese la cantidad de notas:");
        N = Integer.parseInt(entrada.nextLine().trim());
        while (((N <= 0))) {
            System.out.println("La cantidad de notas debe ser mayor que 0");
            System.out.println("Ingrese la cantidad de notas:");
            N = Integer.parseInt(entrada.nextLine().trim());
        }
        SUMA = 0;
        for (I = (int) (1); I < ((int) (N) + 1); I += 1) {
            System.out.println("Ingrese la nota " + "" + String.valueOf(I) + "" + " (0 a 10):");
            NOTA = Double.parseDouble(entrada.nextLine().trim());
            while ((((NOTA < 0)) || ((NOTA > 10)))) {
                System.out.println("La nota debe estar entre 0 y 10");
                System.out.println("Ingrese la nota " + "" + String.valueOf(I) + "" + " (0 a 10):");
                NOTA = Double.parseDouble(entrada.nextLine().trim());
            }
            SUMA = (SUMA + NOTA);
        }
        P = ((double) (SUMA) / (N));
        System.out.println("El promedio de las notas es: " + "" + String.valueOf(P));
    }
}
