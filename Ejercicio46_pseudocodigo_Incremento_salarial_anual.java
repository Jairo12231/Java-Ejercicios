import java.util.Scanner;

// 46 pseudocodigo Incremento salarial anual
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio46_pseudocodigo_Incremento_salarial_anual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int A = 0;
        double S = 0;

        S = 1500;
        A = 1;
        while (((A <= 6))) {
            S = (S * 1.1);
            System.out.println("Salario al finalizar el año " + "" + String.valueOf(A) + "" + ": $" + "" + String.valueOf(S));
            A = (A + 1);
        }
        System.out.println("Salario final despues de 6 años: $" + "" + String.valueOf(S));
    }
}
