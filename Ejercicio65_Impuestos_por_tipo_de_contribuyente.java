import java.util.Scanner;

// 65 Impuestos por tipo de contribuyente
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio65_Impuestos_por_tipo_de_contribuyente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double I = 0;
        int O = 0;
        double T = 0;
        boolean V = false;

        System.out.println("Tipo: 1 Estudiante, 2 Independiente, 3 Empleado, 4 Empresa");
        O = Integer.parseInt(entrada.nextLine().trim());
        System.out.println("Ingreso anual:");
        I = Double.parseDouble(entrada.nextLine().trim());
        V = true;
        T = 0;
        if (((I < 0))) {
            System.out.println("Ingreso no valido");
        } else {
            if (((O == 1))) {
                if (((I >= 5000))) {
                    T = (I * 0.05);
                }
            } else {
                if (((O == 2))) {
                    T = (I * 0.1);
                } else {
                    if (((O == 3))) {
                        T = (I * 0.12);
                        if (((I > 20000))) {
                            T = (T + (I * 0.02));
                        }
                    } else {
                        if (((O == 4))) {
                            T = (I * 0.15);
                        } else {
                            V = false;
                        }
                    }
                }
            }
            if (V) {
                System.out.println("Impuesto anual: $" + "" + String.valueOf(T));
            } else {
                System.out.println("Tipo invalido");
            }
        }
    }
}
