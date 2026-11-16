import java.util.Scanner;

// 10 pseudocodigo Gasto semanal transporte
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio10_pseudocodigo_Gasto_semanal_transporte {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int DS = 0;
        double GS = 0;
        double PC = 0;
        int VD = 0;

        System.out.println("Ingrese el numero de viajes por dia:");
        VD = Integer.parseInt(entrada.nextLine().trim());
        while (((VD <= 0))) {
            System.out.println("Los viajes por dia deben ser mayores que 0");
            System.out.println("Ingrese el numero de viajes por dia:");
            VD = Integer.parseInt(entrada.nextLine().trim());
        }
        System.out.println("Ingrese el costo de cada pasaje:");
        PC = Double.parseDouble(entrada.nextLine().trim());
        while (((PC <= 0))) {
            System.out.println("El costo del pasaje debe ser mayor que 0");
            System.out.println("Ingrese el costo de cada pasaje:");
            PC = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese los dias que viaja a la semana (1 a 7):");
        DS = Integer.parseInt(entrada.nextLine().trim());
        while ((((DS < 1)) || ((DS > 7)))) {
            System.out.println("Los dias deben estar entre 1 y 7");
            System.out.println("Ingrese los dias que viaja a la semana (1 a 7):");
            DS = Integer.parseInt(entrada.nextLine().trim());
        }
        GS = ((VD * PC) * DS);
        System.out.println("El gasto semanal de transporte es: $" + "" + String.valueOf(GS));
    }
}
