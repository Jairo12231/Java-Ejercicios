import java.util.Scanner;

// 26 pseudocodigo Horas de trabajo
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio26_pseudocodigo_Horas_de_trabajo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double H = 0;
        double HE = 0;
        double S1 = 0;
        double S2 = 0;
        double SF = 0;
        double SXH = 0;

        System.out.println("Ingrese las horas trabajadas");
        H = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese el sueldo por hora trabajada");
        SXH = Double.parseDouble(entrada.nextLine().trim());
        HE = 0;
        while ((((H <= 0)) || ((H > 168)))) {
            System.out.println("El numero ingresado debe ser mayor que 0 y menor o igual a 168 horas");
            System.out.println("Ingrese las horas trabajadas");
            H = Double.parseDouble(entrada.nextLine().trim());
        }
        while (((SXH <= 0))) {
            System.out.println("El sueldo por hora debe ser mayor que 0");
            System.out.println("Ingrese el sueldo por hora trabajada");
            SXH = Double.parseDouble(entrada.nextLine().trim());
        }
        if (((H <= 40))) {
            SF = (H * SXH);
        } else {
            HE = (H - 40);
            S1 = (40 * SXH);
            S2 = (HE * (SXH * 2));
            SF = (S1 + S2);
        }
        System.out.println("Las horas extras trabajadas son: " + "" + String.valueOf(HE));
        System.out.println("El sueldo semanal es: " + "" + String.valueOf(SF));
    }
}
