import java.util.Scanner;

// 15 Punto medio y distancia entre dos puntos
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio15_Punto_medio_y_distancia_entre_dos_puntos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double DIS = 0;
        double X1 = 0;
        double X2 = 0;
        double XM = 0;
        double Y1 = 0;
        double Y2 = 0;
        double YM = 0;

        System.out.println("Ingrese la coordenada x del primer punto:");
        X1 = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese la coordenada y del primer punto:");
        Y1 = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese la coordenada x del segundo punto:");
        X2 = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese la coordenada y del segundo punto:");
        Y2 = Double.parseDouble(entrada.nextLine().trim());
        DIS = Math.sqrt((Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2)));
        XM = ((double) ((X1 + X2)) / (2));
        YM = ((double) ((Y1 + Y2)) / (2));
        System.out.println("Distancia entre los puntos: " + "" + String.valueOf(DIS));
        System.out.println("Punto medio: (" + "" + String.valueOf(XM) + "" + ", " + "" + String.valueOf(YM) + "" + ")");
    }
}
