import java.util.Scanner;

// 58 Clasificacion notas UTPL
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio58_Clasificacion_notas_UTPL {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double N = 0;

        System.out.println("Ingrese la nota (0 a 10):");
        N = Double.parseDouble(entrada.nextLine().trim());
        if ((((N >= 0)) && ((N <= 10)))) {
            if (((N >= 9))) {
                System.out.println("Excelente");
            } else {
                if (((N >= 7))) {
                    System.out.println("Aprobado");
                } else {
                    System.out.println("Reprobado");
                }
            }
        } else {
            System.out.println("Nota fuera de rango");
        }
    }
}
