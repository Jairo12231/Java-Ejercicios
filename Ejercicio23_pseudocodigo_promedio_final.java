import java.util.Scanner;

// 23 pseudocodigo promedio final
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio23_pseudocodigo_promedio_final {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double N1 = 0;
        double N2 = 0;
        double N3 = 0;
        double P = 0;

        System.out.println("Ingrese nota parcial 1");
        N1 = Double.parseDouble(entrada.nextLine().trim());
        while ((((N1 < 0)) || ((N1 > 10)))) {
            System.out.println("La nota no puede menor que 0 ni mayor a 10");
            System.out.println("Ingrese nota parcial 1");
            N1 = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese nota parcial 2");
        N2 = Double.parseDouble(entrada.nextLine().trim());
        while ((((N2 < 0)) || ((N2 > 10)))) {
            System.out.println("La nota no puede menor que 0 ni mayor a 10");
            System.out.println("Ingrese nota parcial 2");
            N2 = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese nota parcial 3");
        N3 = Double.parseDouble(entrada.nextLine().trim());
        while ((((N3 < 0)) || ((N3 > 10)))) {
            System.out.println("La nota no puede menor que 0 ni mayor a 10");
            System.out.println("Ingrese nota parcial 3");
            N3 = Double.parseDouble(entrada.nextLine().trim());
        }
        P = (((N1 * 0.3) + (N2 * 0.3)) + (N3 * 0.4));
        if (((P >= 7))) {
            System.out.println("El estudiante aprueba y su promedio es:" + "" + String.valueOf(P));
        } else {
            System.out.println("El estudiante no aprueba y su promedio es:" + "" + String.valueOf(P));
        }
    }
}
