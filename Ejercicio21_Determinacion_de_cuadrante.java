import java.util.Scanner;

// 21 Determinacion de cuadrante
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio21_Determinacion_de_cuadrante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double X = 0;
        double Y = 0;

        System.out.println("Ingrese la coordenada X:");
        X = Double.parseDouble(entrada.nextLine().trim());
        System.out.println("Ingrese la coordenada Y:");
        Y = Double.parseDouble(entrada.nextLine().trim());
        if ((((X == 0)) && ((Y == 0)))) {
            System.out.println("El punto esta en el origen");
        } else {
            if (((X == 0))) {
                System.out.println("El punto esta sobre el eje Y");
            } else {
                if (((Y == 0))) {
                    System.out.println("El punto esta sobre el eje X");
                } else {
                    if ((((X > 0)) && ((Y > 0)))) {
                        System.out.println("Primer cuadrante");
                    } else {
                        if ((((X < 0)) && ((Y > 0)))) {
                            System.out.println("Segundo cuadrante");
                        } else {
                            if ((((X < 0)) && ((Y < 0)))) {
                                System.out.println("Tercer cuadrante");
                            } else {
                                System.out.println("Cuarto cuadrante");
                            }
                        }
                    }
                }
            }
        }
    }
}
