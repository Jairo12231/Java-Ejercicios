import java.util.Scanner;

// 04 Costo total de un viaje con peajes
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio04_Costo_total_de_un_viaje_con_peajes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double CC = 0;
        double CON = 0;
        double CP = 0;
        double CT = 0;
        double CTP = 0;
        double DIS = 0;
        double LIT = 0;
        int NP = 0;
        double PCL = 0;

        System.out.println("Ingrese la distancia del viaje en km:");
        DIS = Double.parseDouble(entrada.nextLine().trim());
        while (((DIS <= 0))) {
            System.out.println("La distancia debe ser mayor que 0");
            System.out.println("Ingrese la distancia del viaje en km:");
            DIS = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese el rendimiento del auto en km por litro:");
        CON = Double.parseDouble(entrada.nextLine().trim());
        while (((CON <= 0))) {
            System.out.println("El rendimiento debe ser mayor que 0");
            System.out.println("Ingrese el rendimiento del auto en km por litro:");
            CON = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese el precio del combustible por litro:");
        PCL = Double.parseDouble(entrada.nextLine().trim());
        while (((PCL < 0))) {
            System.out.println("El precio no puede ser negativo");
            System.out.println("Ingrese el precio del combustible por litro:");
            PCL = Double.parseDouble(entrada.nextLine().trim());
        }
        System.out.println("Ingrese la cantidad de peajes:");
        NP = Integer.parseInt(entrada.nextLine().trim());
        while (((NP < 0))) {
            System.out.println("La cantidad de peajes no puede ser negativa");
            System.out.println("Ingrese la cantidad de peajes:");
            NP = Integer.parseInt(entrada.nextLine().trim());
        }
        System.out.println("Ingrese el costo unitario de cada peaje:");
        CP = Double.parseDouble(entrada.nextLine().trim());
        while (((CP < 0))) {
            System.out.println("El costo del peaje no puede ser negativo");
            System.out.println("Ingrese el costo unitario de cada peaje:");
            CP = Double.parseDouble(entrada.nextLine().trim());
        }
        LIT = ((double) (DIS) / (CON));
        CC = (LIT * PCL);
        CTP = (NP * CP);
        CT = (CC + CTP);
        System.out.println("Litros necesarios: " + "" + String.valueOf(LIT));
        System.out.println("Costo de combustible: $" + "" + String.valueOf(CC));
        System.out.println("Costo de peajes: $" + "" + String.valueOf(CTP));
        System.out.println("Costo total del viaje: $" + "" + String.valueOf(CT));
    }
}
