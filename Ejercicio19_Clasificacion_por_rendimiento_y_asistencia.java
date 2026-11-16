import java.util.Scanner;

// 19 Clasificacion por rendimiento y asistencia
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio19_Clasificacion_por_rendimiento_y_asistencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A = 0;
        String CAT = "";
        double P = 0;

        System.out.println("Ingrese el promedio (0 a 10):");
        P = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese la asistencia (0 a 100):");
        A = Double.parseDouble(entrada.nextLine().trim());
        if ((((P < 0)) || ((P > 10)) || ((A < 0)) || ((A > 100)))) {
            CAT = "Datos no validos";
        } else {
            if ((((P >= 9)) && ((A >= 90)))) {
                CAT = "Excelente";
            } else {
                if ((((P >= 7)) && ((A >= 80)))) {
                    CAT = "Bueno";
                } else {
                    if ((((P >= 6)) && ((A >= 70)))) {
                        CAT = "Regular";
                    } else {
                        CAT = "Deficiente";
                    }
                }
            }
        }
        System.out.println("Categoria: " + "" + CAT);
    }
}
