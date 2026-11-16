import java.util.Scanner;

// 28 pseudocodigo Par o Impar
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio28_pseudocodigo_Par_o_Impar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N = 0;

        System.out.println("Ingrese un numero entero:");
        N = Integer.parseInt(entrada.nextLine().trim());
        if ((((N % 2) == 0))) {
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }
    }
}
