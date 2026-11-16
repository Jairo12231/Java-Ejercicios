import java.util.Scanner;

// 48 pseudocodigo Suma de numeros hasta ingresar 0
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio48_pseudocodigo_Suma_de_numeros_hasta_ingresar_0 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N = 0;
        int SUMA = 0;

        SUMA = 0;
        System.out.println("Ingrese un numero (0 para terminar):");
        N = Integer.parseInt(entrada.nextLine().trim());
        while (((N != 0))) {
            SUMA = (SUMA + N);
            System.out.println("Ingrese un numero (0 para terminar):");
            N = Integer.parseInt(entrada.nextLine().trim());
        }
        System.out.println("La suma total es: " + "" + String.valueOf(SUMA));
    }
}
