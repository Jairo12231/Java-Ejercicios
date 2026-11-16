import java.util.Scanner;

// 54 Acceso a laboratorio de computo
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio54_Acceso_a_laboratorio_de_computo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String A = "";
        String C = "";
        String E = "";

        System.out.println("Es estudiante? (S/N):");
        E = entrada.nextLine();
        System.out.println("Tiene carne vigente? (S/N):");
        C = entrada.nextLine();
        System.out.println("Tiene autorizacion especial? (S/N):");
        A = entrada.nextLine();
        if ((((!(E.equals("S"))) && (!(E.equals("N")))) || ((!(C.equals("S"))) && (!(C.equals("N")))) || ((!(A.equals("S"))) && (!(A.equals("N")))))) {
            System.out.println("Responda en mayusculas S o N");
        } else {
            if (((E.equals("S")))) {
                if (((C.equals("S")))) {
                    System.out.println("Acceso permitido");
                } else {
                    System.out.println("Acceso denegado: carne no vigente");
                }
            } else {
                if (((A.equals("S")))) {
                    System.out.println("Ingreso temporal autorizado");
                } else {
                    System.out.println("Acceso denegado");
                }
            }
        }
    }
}
