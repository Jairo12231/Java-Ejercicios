import java.util.Scanner;

// 68 Conversor de monedas con comision
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio68_Conversor_de_monedas_con_comision {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double C = 0;
        double CD = 0;
        double CU = 0;
        double M = 0;
        int O = 0;
        double R = 0;
        double T = 0;

        System.out.println("Moneda: 1 EUR, 2 GBP, 3 JPY, 4 MXN");
        O = Integer.parseInt(entrada.nextLine().trim());
        System.out.println("Monto en USD:");
        M = Double.parseDouble(entrada.nextLine().trim());
        if ((((M < 0)) || ((O < 1)) || ((O > 4)))) {
            System.out.println("Datos invalidos");
        } else {
            if (((O == 1))) {
                T = 0.92;
                C = 0.01;
            } else {
                if (((O == 2))) {
                    T = 0.78;
                    C = 0.01;
                } else {
                    if (((O == 3))) {
                        T = 149;
                        C = 0.015;
                    } else {
                        if (((O == 4))) {
                            T = 17.2;
                            C = 0.02;
                        }
                    }
                }
            }
            CU = (M * C);
            CD = (CU * T);
            R = ((M * T) - CD);
            System.out.println("Comision en USD: $" + "" + String.valueOf(CU));
            System.out.println("Comision en moneda destino: " + "" + String.valueOf(CD));
            System.out.println("Monto convertido neto: " + "" + String.valueOf(R));
        }
    }
}
