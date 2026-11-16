import java.util.Scanner;

// 27 pseudocodigo menor de tres numeros
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio27_pseudocodigo_menor_de_tres_numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double MEN = 0;
        double N1 = 0;
        double N2 = 0;
        double N3 = 0;

        System.out.println("Ingrese el primer numero:");
        N1 = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el segundo numero:");
        N2 = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el tercer numero:");
        N3 = Double.parseDouble(entrada.nextLine().trim());
        if ((((N1 <= N2)) && ((N1 <= N3)))) {
            MEN = N1;
        } else {
            if ((((N2 <= N1)) && ((N2 <= N3)))) {
                MEN = N2;
            } else {
                MEN = N3;
            }
        }
        System.out.println("El menor de los tres numeros es: " + "" + String.valueOf(MEN));
    }
}
