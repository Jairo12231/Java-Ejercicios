import java.util.Scanner;

// 60 Menu de cafeteria UTPL
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio60_Menu_de_cafeteria_UTPL {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int O = 0;

        System.out.println("1. Cafe ($1.50)");
        System.out.println("2. Jugo ($1.20)");
        System.out.println("3. Sandwich ($2.50)");
        System.out.println("4. Salir");
        O = Integer.parseInt(entrada.nextLine().trim());
        if (((O == 1))) {
            System.out.println("Cafe: $1.50");
        } else {
            if (((O == 2))) {
                System.out.println("Jugo: $1.20");
            } else {
                if (((O == 3))) {
                    System.out.println("Sandwich: $2.50");
                } else {
                    if (((O == 4))) {
                        System.out.println("Gracias por visitar la cafeteria");
                    } else {
                        System.out.println("Opcion no valida");
                    }
                }
            }
        }
    }
}
