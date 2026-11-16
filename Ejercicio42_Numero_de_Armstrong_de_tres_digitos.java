import java.util.Scanner;

// 42 Numero de Armstrong de tres digitos
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio42_Numero_de_Armstrong_de_tres_digitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int D = 0;
        int N = 0;
        int S = 0;
        int T = 0;

        System.out.println("Ingrese un numero de tres digitos:");
        N = Integer.parseInt(entrada.nextLine().trim());
        if ((((N < 100)) || ((N > 999)))) {
            System.out.println("Debe ingresar un numero de tres digitos");
        } else {
            T = N;
            S = 0;
            while (((T > 0))) {
                D = (T % 10);
                S = (int) ((S + Math.pow(D, 3)));
                T = (int) (((double) (T) / (10)));
            }
            if (((S == N))) {
                System.out.println(String.valueOf(N) + "" + " es un numero de Armstrong");
            } else {
                System.out.println(String.valueOf(N) + "" + " no es un numero de Armstrong");
            }
        }
    }
}
