import java.util.Scanner;

// 39 Estadisticas de N calificaciones
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio39_Estadisticas_de_N_calificaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int APR = 0;
        int I = 0;
        double MAY = 0;
        double MEN = 0;
        int N = 0;
        double NOTA = 0;
        double P = 0;
        int REP = 0;
        double SUMA = 0;

        System.out.println("Ingrese la cantidad de calificaciones:");
        N = Integer.parseInt(entrada.nextLine().trim());
        while (((N <= 0))) {
            System.out.println("La cantidad debe ser mayor que 0");
            System.out.println("Ingrese la cantidad de calificaciones:");
            N = Integer.parseInt(entrada.nextLine().trim());
        }
        SUMA = 0;
        APR = 0;
        REP = 0;
        for (I = (int) (1); I < ((int) (N) + 1); I += 1) {
            System.out.println("Ingrese la calificacion " + "" + String.valueOf(I) + "" + " (0 a 10):");
            NOTA = Double.parseDouble(entrada.nextLine().trim());
            while ((((NOTA < 0)) || ((NOTA > 10)))) {
                System.out.println("La nota debe estar entre 0 y 10");
                System.out.println("Ingrese la calificacion " + "" + String.valueOf(I) + "" + " (0 a 10):");
                NOTA = Double.parseDouble(entrada.nextLine().trim());
            }
            SUMA = (SUMA + NOTA);
            if (((I == 1))) {
                MAY = NOTA;
                MEN = NOTA;
            } else {
                if (((NOTA > MAY))) {
                    MAY = NOTA;
                }
                if (((NOTA < MEN))) {
                    MEN = NOTA;
                }
            }
            if (((NOTA >= 7))) {
                APR = (APR + 1);
            } else {
                REP = (REP + 1);
            }
        }
        P = ((double) (SUMA) / (N));
        System.out.println("Promedio: " + "" + String.valueOf(P));
        System.out.println("Calificacion mayor: " + "" + String.valueOf(MAY));
        System.out.println("Calificacion menor: " + "" + String.valueOf(MEN));
        System.out.println("Cantidad de aprobados: " + "" + String.valueOf(APR));
        System.out.println("Cantidad de reprobados: " + "" + String.valueOf(REP));
    }
}
