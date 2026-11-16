import java.util.Scanner;

// 33 Validacion de fecha
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio33_Validacion_de_fecha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ANIO = 0;
        boolean BIS = false;
        int DIA = 0;
        int DM = 0;
        int MES = 0;

        System.out.println("Ingrese el dia:");
        DIA = Integer.parseInt(entrada.nextLine().trim());
        System.out.println("Ingrese el mes:");
        MES = Integer.parseInt(entrada.nextLine().trim());
        System.out.println("Ingrese el anio:");
        ANIO = Integer.parseInt(entrada.nextLine().trim());
        DM = 0;
        BIS = false;
        if ((((ANIO > 0)) && ((MES >= 1)) && ((MES <= 12)) && ((DIA >= 1)))) {
            if (((((ANIO % 400) == 0)) || ((((ANIO % 4) == 0)) && (((ANIO % 100) != 0))))) {
                BIS = true;
            }
            if (((MES == 2))) {
                if (BIS) {
                    DM = 29;
                } else {
                    DM = 28;
                }
            } else {
                if ((((MES == 4)) || ((MES == 6)) || ((MES == 9)) || ((MES == 11)))) {
                    DM = 30;
                } else {
                    DM = 31;
                }
            }
        }
        if ((((DM > 0)) && ((DIA <= DM)))) {
            System.out.println("La fecha es valida");
        } else {
            System.out.println("La fecha no es valida");
        }
    }
}
