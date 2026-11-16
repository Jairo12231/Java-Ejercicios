import java.util.Scanner;

// 55 Bono por antiguedad y evaluacion
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio55_Bono_por_antiguedad_y_evaluacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A = 0;
        double B = 0;
        String E = "";
        double S = 0;
        double T = 0;

        System.out.println("Antiguedad del trabajador en anos:");
        A = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Sueldo base:");
        S = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Evaluacion excelente? (S/N):");
        E = entrada.nextLine();
        if ((((A < 0)) || ((S < 0)) || ((!(E.equals("S"))) && (!(E.equals("N")))))) {
            System.out.println("Datos invalidos");
        } else {
            B = 0;
            if (((A > 2))) {
                B = (S * 0.1);
                if (((E.equals("S")))) {
                    B = (B + (S * 0.05));
                }
            } else {
                if (((A < 2))) {
                    if (((E.equals("S")))) {
                        B = (S * 0.05);
                    }
                }
            }
            T = (S + B);
            System.out.println("Bono: $" + "" + String.valueOf(B));
            System.out.println("Sueldo total: $" + "" + String.valueOf(T));
        }
    }
}
