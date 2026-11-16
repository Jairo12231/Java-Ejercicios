import java.util.Scanner;

// 67 Nivel academico y recomendacion
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio67_Nivel_academico_y_recomendacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N = 0;
        double P = 0;
        int R = 0;

        System.out.println("Promedio de 0 a 10:");
        P = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Materias reprobadas:");
        R = Integer.parseInt(entrada.nextLine().trim());
        if ((((P < 0)) || ((P > 10)) || ((R < 0)))) {
            System.out.println("Datos invalidos");
        } else {
            N = 4;
            if ((((P >= 9)) && ((R == 0)))) {
                N = 1;
            } else {
                if ((((P >= 8)) && ((R <= 1)))) {
                    N = 2;
                } else {
                    if (((P >= 7))) {
                        N = 3;
                    }
                }
            }
            if (((N == 1))) {
                System.out.println("Excelente - Continua asi");
            } else {
                if (((N == 2))) {
                    System.out.println("Bueno - Refuerza debilidades");
                } else {
                    if (((N == 3))) {
                        System.out.println("Regular - Necesitas mas estudio");
                    } else {
                        if (((N == 4))) {
                            System.out.println("En riesgo - Busca tutoria");
                        }
                    }
                }
            }
        }
    }
}
