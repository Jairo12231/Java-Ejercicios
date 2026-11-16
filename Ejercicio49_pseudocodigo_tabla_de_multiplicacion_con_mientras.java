import java.util.Scanner;

// 49 pseudocodigo tabla de multiplicacion con mientras
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio49_pseudocodigo_tabla_de_multiplicacion_con_mientras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int I = 0;
        int K = 0;
        int R = 0;

        System.out.println("Ingrese el numero entero para mostrar su tabla:");
        K = Integer.parseInt(entrada.nextLine().trim());
        I = 1;
        while (((I <= 10))) {
            R = (K * I);
            System.out.println(String.valueOf(K) + "" + " x " + "" + String.valueOf(I) + "" + " = " + "" + String.valueOf(R));
            I = (I + 1);
        }
    }
}
