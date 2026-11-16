import java.util.Scanner;

// 45 pseudocodigo factorial de un numero
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio45_pseudocodigo_factorial_de_un_numero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int F = 0;
        int N = 0;
        int X = 0;

        System.out.println("Ingrese un numero entero");
        N = Integer.parseInt(entrada.nextLine().trim());
        if (((N < 0))) {
            System.out.println("No existe factorial para numeros negativos");
        } else {
            X = N;
            F = 1;
            while (((X >= 1))) {
                F = (F * X);
                X = (X - 1);
            }
            System.out.println("El factorial del numero es:" + "" + String.valueOf(F));
        }
    }
}
