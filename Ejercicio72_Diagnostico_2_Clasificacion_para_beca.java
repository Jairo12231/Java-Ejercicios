import java.util.Scanner;

// 72 Diagnostico 2 Clasificacion para beca
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio72_Diagnostico_2_Clasificacion_para_beca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int B = 0;
        String C = "";
        double P = 0;
        int R = 0;

        System.out.println("Promedio (0 a 10):");
        P = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Materias reprobadas:");
        R = Integer.parseInt(entrada.nextLine().trim());
        System.out.println("Es de primer ciclo? (S/N):");
        C = entrada.nextLine();
        if ((((P < 0)) || ((P > 10)) || ((R < 0)) || ((!(C.equals("S"))) && (!(C.equals("N")))))) {
            System.out.println("Datos invalidos");
        } else {
            if ((((P >= 9)) && ((R == 0)) && ((C.equals("S"))))) {
                B = 100;
            } else {
                if ((((P >= 8)) && ((R <= 1)))) {
                    B = 70;
                } else {
                    if ((((P >= 7)) && ((R <= 2)))) {
                        B = 40;
                    } else {
                        B = 0;
                    }
                }
            }
            System.out.println("Porcentaje de beca: " + "" + String.valueOf(B) + "" + "%");
            if (((B > 0))) {
                System.out.println("Beca aprobada");
            } else {
                System.out.println("Beca rechazada");
            }
        }
    }
}
