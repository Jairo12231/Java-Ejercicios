import java.util.Scanner;

// 56 Tarifa de parqueadero de estudiantes
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio56_Tarifa_de_parqueadero_de_estudiantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String E = "";
        double H = 0;
        double T = 0;

        System.out.println("Horas de permanencia:");
        H = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Es estudiante UTPL? (S/N):");
        E = entrada.nextLine();
        if ((((H < 0)) || ((!(E.equals("S"))) && (!(E.equals("N")))))) {
            System.out.println("Datos invalidos");
        } else {
            T = (H * 1);
            if (((E.equals("S")))) {
                T = (T * 0.5);
                if (((H > 4))) {
                    T = (T * 1.2);
                }
            } else {
                if (((H > 6))) {
                    T = (T * 1.2);
                }
            }
            System.out.println("Total a pagar: $" + "" + String.valueOf(T));
        }
    }
}
