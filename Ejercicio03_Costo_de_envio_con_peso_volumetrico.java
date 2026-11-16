import java.util.Scanner;

// 03 Costo de envio con peso volumetrico
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio03_Costo_de_envio_con_peso_volumetrico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A = 0;
        double CT = 0;
        double H = 0;
        double L = 0;
        double PC = 0;
        double PR = 0;
        double PV = 0;

        System.out.println("Ingrese el peso real en kg:");
        PR = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese largo en cm:");
        L = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese ancho en cm:");
        A = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese alto en cm:");
        H = Double.parseDouble(entrada.nextLine().trim());
        if ((((PR < 0)) || ((L < 0)) || ((A < 0)) || ((H < 0)))) {
            System.out.println("Datos no validos");
        } else {
            PV = ((double) (((L * A) * H)) / (5000));
            if (((PR >= PV))) {
                PC = PR;
            } else {
                PC = PV;
            }
            CT = (PC * 2.5);
            System.out.println("Peso volumetrico: " + "" + String.valueOf(PV) + "" + " kg");
            System.out.println("Peso a cobrar: " + "" + String.valueOf(PC) + "" + " kg");
            System.out.println("Costo total: $" + "" + String.valueOf(CT));
        }
    }
}
