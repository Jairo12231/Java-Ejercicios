import java.util.Scanner;

// 43 Numeros perfectos
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio43_Numeros_perfectos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int DIV = 0;
        int N = 0;
        int SUMA = 0;

        System.out.println("Ingrese un numero entero positivo:");
        N = Integer.parseInt(entrada.nextLine().trim());
        while (((N <= 0))) {
            System.out.println("El numero debe ser mayor que 0");
            System.out.println("Ingrese un numero entero positivo:");
            N = Integer.parseInt(entrada.nextLine().trim());
        }
        SUMA = 0;
        DIV = 1;
        while (((DIV <= (int) (((double) (N) / (2)))))) {
            if ((((N % DIV) == 0))) {
                SUMA = (SUMA + DIV);
            }
            DIV = (DIV + 1);
        }
        if ((((SUMA == N)) && ((N > 1)))) {
            System.out.println(String.valueOf(N) + "" + " es un numero perfecto");
        } else {
            System.out.println(String.valueOf(N) + "" + " no es un numero perfecto");
        }
    }
}
