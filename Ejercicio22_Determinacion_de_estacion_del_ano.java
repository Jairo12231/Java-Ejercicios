import java.util.Scanner;

// 22 Determinacion de estacion del ano
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio22_Determinacion_de_estacion_del_ano {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int DIA = 0;
        int DM = 0;
        String EST = "";
        int MES = 0;

        System.out.println("Ingrese el mes (1 a 12):");
        MES = Integer.parseInt(entrada.nextLine().trim());
        System.out.println("Ingrese el dia:");
        DIA = Integer.parseInt(entrada.nextLine().trim());
        DM = 31;
        if ((((MES == 4)) || ((MES == 6)) || ((MES == 9)) || ((MES == 11)))) {
            DM = 30;
        } else {
            if (((MES == 2))) {
                DM = 28;
            }
        }
        if ((((MES < 1)) || ((MES > 12)) || ((DIA < 1)) || ((DIA > DM)))) {
            System.out.println("Fecha no valida");
        } else {
            if (((((MES == 12)) && ((DIA >= 21))) || ((MES == 1)) || ((MES == 2)) || (((MES == 3)) && ((DIA <= 20))))) {
                EST = "Verano";
            } else {
                if (((((MES == 3)) && ((DIA >= 21))) || ((MES == 4)) || ((MES == 5)) || (((MES == 6)) && ((DIA <= 20))))) {
                    EST = "Otono";
                } else {
                    if (((((MES == 6)) && ((DIA >= 21))) || ((MES == 7)) || ((MES == 8)) || (((MES == 9)) && ((DIA <= 22))))) {
                        EST = "Invierno";
                    } else {
                        EST = "Primavera";
                    }
                }
            }
            System.out.println("La estacion del anio es: " + "" + EST);
        }
    }
}
