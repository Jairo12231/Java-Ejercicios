import java.util.Scanner;

// 08 pseudocodigo compra con descuento
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio08_pseudocodigo_compra_con_descuento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double IVA = 0;
        double P = 0;
        double PCD = 0;
        double PD = 0;
        double PF = 0;
        double PIVA = 0;

        IVA = 0.15;
        System.out.println("Ingresar el valor del producto");
        P = Double.parseDouble(entrada.nextLine().trim());
        while (((P <= 0))) {
            System.out.println("El valor de producto no puede ser menor ni igual a 0");
            System.out.println("Ingresar el valor del producto");
            P = Double.parseDouble(entrada.nextLine().trim());
        }
        PD = (P * 0.2);
        PCD = (P - PD);
        PIVA = (PCD * IVA);
        PF = (PCD + PIVA);
        System.out.println("Descuento aplicado" + "" + String.valueOf(PD));
        System.out.println("Precio con el descuento" + "" + String.valueOf(PCD));
        System.out.println("IVA aplicado" + "" + String.valueOf(PIVA));
        System.out.println("Precio final" + "" + String.valueOf(PF));
    }
}
