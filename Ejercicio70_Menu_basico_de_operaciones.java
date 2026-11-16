import java.util.Scanner;

// 70 Menu basico de operaciones
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio70_Menu_basico_de_operaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int O = 0;

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Salir");
        System.out.println("Elija una opcion:");
        O = Integer.parseInt(entrada.nextLine().trim());
        if (((O == 1))) {
            System.out.println("Operacion: Suma");
        } else {
            if (((O == 2))) {
                System.out.println("Operacion: Resta");
            } else {
                if (((O == 3))) {
                    System.out.println("Operacion: Multiplicacion");
                } else {
                    if (((O == 4))) {
                        System.out.println("Saliendo del programa");
                    } else {
                        System.out.println("Opcion no valida");
                    }
                }
            }
        }
    }
}
