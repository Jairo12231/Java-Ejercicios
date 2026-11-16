import java.util.Scanner;

// 62 Conversor de unidades simple
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio62_Conversor_de_unidades_simple {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int O = 0;
        double R = 0;
        double V = 0;

        System.out.println("1. Km a m");
        System.out.println("2. m a cm");
        System.out.println("3. Horas a minutos");
        System.out.println("4. Salir");
        O = Integer.parseInt(entrada.nextLine().trim());
        if ((((O >= 1)) && ((O <= 3)))) {
            System.out.println("Ingrese el valor a convertir:");
            V = Double.parseDouble(entrada.nextLine().trim());
            if (((O == 1))) {
                R = (V * 1000);
            } else {
                if (((O == 2))) {
                    R = (V * 100);
                } else {
                    if (((O == 3))) {
                        R = (V * 60);
                    }
                }
            }
            System.out.println("Resultado: " + "" + String.valueOf(R));
        } else {
            if (((O == 4))) {
                System.out.println("Fin del conversor");
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }
}
