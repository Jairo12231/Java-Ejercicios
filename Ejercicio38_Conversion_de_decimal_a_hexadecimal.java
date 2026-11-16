import java.util.Scanner;

// 38 Conversion de decimal a hexadecimal
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio38_Conversion_de_decimal_a_hexadecimal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String DIG = "";
        String HEX = "";
        int NUM = 0;
        int RES = 0;

        System.out.println("Ingrese un numero entero decimal no negativo:");
        NUM = Integer.parseInt(entrada.nextLine().trim());
        while (((NUM < 0))) {
            System.out.println("El numero debe ser no negativo");
            System.out.println("Ingrese un numero entero decimal no negativo:");
            NUM = Integer.parseInt(entrada.nextLine().trim());
        }
        HEX = "";
        if (((NUM == 0))) {
            HEX = "0";
        } else {
            while (((NUM > 0))) {
                RES = (NUM % 16);
                if (((RES < 10))) {
                    DIG = String.valueOf(RES);
                } else {
                    if (((RES == 10))) {
                        DIG = "A";
                    } else {
                        if (((RES == 11))) {
                            DIG = "B";
                        } else {
                            if (((RES == 12))) {
                                DIG = "C";
                            } else {
                                if (((RES == 13))) {
                                    DIG = "D";
                                } else {
                                    if (((RES == 14))) {
                                        DIG = "E";
                                    } else {
                                        if (((RES == 15))) {
                                            DIG = "F";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                HEX = (String.valueOf(DIG) + String.valueOf(HEX));
                NUM = (int) (((double) (NUM) / (16)));
            }
        }
        System.out.println("Representacion hexadecimal: " + "" + HEX);
    }
}
