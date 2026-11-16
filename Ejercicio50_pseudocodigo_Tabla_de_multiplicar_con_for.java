import java.util.Scanner;

// 50 pseudocodigo Tabla de multiplicar con for
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio50_pseudocodigo_Tabla_de_multiplicar_con_for {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int I = 0;
        int K = 0;
        int R = 0;

        System.out.println("Ingrese el numero entero para mostrar su tabla:");
        K = Integer.parseInt(entrada.nextLine().trim());
        for (I = (int) (1); I < ((int) (10) + 1); I += 1) {
            R = (K * I);
            System.out.println(String.valueOf(K) + "" + " x " + "" + String.valueOf(I) + "" + " = " + "" + String.valueOf(R));
        }
    }
}
