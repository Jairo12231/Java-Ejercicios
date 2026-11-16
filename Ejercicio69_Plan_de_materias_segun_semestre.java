import java.util.Scanner;

// 69 Plan de materias segun semestre
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio69_Plan_de_materias_segun_semestre {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int M = 0;
        double P = 0;
        int S = 0;

        System.out.println("Semestre actual (1 a 4):");
        S = Integer.parseInt(entrada.nextLine().trim());
        System.out.println("Promedio (0 a 10):");
        P = Double.parseDouble(entrada.nextLine().trim());
        if ((((P < 0)) || ((P > 10)) || ((S < 1)) || ((S > 4)))) {
            System.out.println("Datos invalidos");
        } else {
            if ((((S == 1)) || ((S == 2)))) {
                M = 5;
            } else {
                if ((((S == 3)) || ((S == 4)))) {
                    M = 4;
                }
            }
            if (((P >= 8.5))) {
                M = (M + 1);
            } else {
                if (((P < 7))) {
                    M = (M - 1);
                }
            }
            if (((M < 3))) {
                M = 3;
            }
            if (((M > 6))) {
                M = 6;
            }
            System.out.println("Materias recomendadas: " + "" + String.valueOf(M));
        }
    }
}
