import java.util.Scanner;

// 41 Maximo comun divisor Euclides
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio41_Maximo_comun_divisor_Euclides {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int RES = 0;

        System.out.println("Ingrese el primer numero entero positivo:");
        A = Integer.parseInt(entrada.nextLine().trim());
        while (((A <= 0))) {
            System.out.println("El numero debe ser mayor que 0");
            System.out.println("Ingrese el primer numero entero positivo:");
            A = Integer.parseInt(entrada.nextLine().trim());
        }
        System.out.println("Ingrese el segundo numero entero positivo:");
        B = Integer.parseInt(entrada.nextLine().trim());
        while (((B <= 0))) {
            System.out.println("El numero debe ser mayor que 0");
            System.out.println("Ingrese el segundo numero entero positivo:");
            B = Integer.parseInt(entrada.nextLine().trim());
        }
        while (((B != 0))) {
            RES = (A % B);
            A = B;
            B = RES;
        }
        System.out.println("El maximo comun divisor es: " + "" + String.valueOf(A));
    }
}
