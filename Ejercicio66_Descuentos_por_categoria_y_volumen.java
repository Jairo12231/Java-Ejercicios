import java.util.Scanner;

// 66 Descuentos por categoria y volumen
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio66_Descuentos_por_categoria_y_volumen {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int C = 0;
        double D = 0;
        int O = 0;
        double P = 0;
        double T = 0;

        System.out.println("Categoria: 1 Electronica, 2 Ropa, 3 Alimentos, 4 Otros");
        O = Integer.parseInt(entrada.nextLine().trim());
        System.out.println("Cantidad:");
        C = Integer.parseInt(entrada.nextLine().trim());
        System.out.println("Precio unitario:");
        P = Double.parseDouble(entrada.nextLine().trim());
        if ((((C <= 0)) || ((P < 0)) || ((O < 1)) || ((O > 4)))) {
            System.out.println("Datos invalidos");
        } else {
            D = 0;
            if (((O == 1))) {
                if (((C >= 10))) {
                    D = 0.05;
                }
            } else {
                if (((O == 2))) {
                    if (((C >= 5))) {
                        D = 0.1;
                    }
                } else {
                    if (((O == 3))) {
                        D = 0.03;
                    } else {
                        if (((O == 4))) {
                            D = 0;
                        }
                    }
                }
            }
            T = ((P * C) * (1 - D));
            if (((T > 100))) {
                T = (T * 0.98);
            }
            System.out.println("Total a pagar: $" + "" + String.valueOf(T));
        }
    }
}
