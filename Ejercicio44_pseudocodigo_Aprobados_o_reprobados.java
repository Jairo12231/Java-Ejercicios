import java.util.Scanner;

// 44 pseudocodigo Aprobados o reprobados
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio44_pseudocodigo_Aprobados_o_reprobados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A = 0;
        int N = 0;
        double NOTA = 0;
        int R = 0;
        int X = 0;

        System.out.println("Ingrese el numero de alumnos:");
        N = Integer.parseInt(entrada.nextLine().trim());
        A = 0;
        R = 0;
        while (((N <= 0))) {
            System.out.println("La cantidad ingresada no puede ser menor ni igual a 0");
            System.out.println("Ingrese el numero de alumnos:");
            N = Integer.parseInt(entrada.nextLine().trim());
        }
        for (X = (int) (1); X < ((int) (N) + 1); X += 1) {
            System.out.println("Ingrese la calificacion del alumno: " + "" + String.valueOf(X));
            NOTA = Double.parseDouble(entrada.nextLine().trim());
            while ((((NOTA < 0)) || ((NOTA > 10)))) {
                System.out.println("La nota no puede ser negativa ni mayor a 10");
                System.out.println("Ingrese la calificacion del alumno: " + "" + String.valueOf(X));
                NOTA = Double.parseDouble(entrada.nextLine().trim());
            }
            if (((NOTA >= 7))) {
                A = (A + 1);
            } else {
                R = (R + 1);
            }
        }
        System.out.println("Cantidad de aprobados: " + "" + String.valueOf(A));
        System.out.println("Cantidad de reprobados: " + "" + String.valueOf(R));
    }
}
