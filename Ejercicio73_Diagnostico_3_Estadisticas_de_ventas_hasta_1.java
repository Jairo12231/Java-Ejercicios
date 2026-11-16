import java.util.Scanner;

// 73 Diagnostico 3 Estadisticas de ventas hasta 1
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio73_Diagnostico_3_Estadisticas_de_ventas_hasta_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int C = 0;
        int D = 0;
        int DM = 0;
        double MAX = 0;
        double P = 0;
        double S = 0;
        double V = 0;

        S = 0;
        D = 0;
        C = 0;
        DM = 0;
        MAX = 0;
        System.out.println("Venta diaria (-1 para terminar):");
        V = Double.parseDouble(entrada.nextLine().trim());
        while (((V != -1))) {
            if (((V < 0))) {
                System.out.println("Venta no valida; ingrese cero o un valor positivo");
            } else {
                D = (D + 1);
                S = (S + V);
                if (((V > 500))) {
                    C = (C + 1);
                }
                if ((((D == 1)) || ((V > MAX)))) {
                    MAX = V;
                    DM = D;
                }
            }
            System.out.println("Siguiente venta (-1 para terminar):");
            V = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Total de ventas: $" + "" + String.valueOf(S));
        System.out.println("Dias con venta superior a $500: " + "" + String.valueOf(C));
        if (((D > 0))) {
            P = ((double) (S) / (D));
            System.out.println("Promedio de ventas: $" + "" + String.valueOf(P));
            System.out.println("Dia de mayor venta: " + "" + String.valueOf(DM));
            System.out.println("Mayor venta: $" + "" + String.valueOf(MAX));
        } else {
            System.out.println("Promedio: no hay ventas registradas");
            System.out.println("No hay dia con mayor venta");
        }
    }
}
