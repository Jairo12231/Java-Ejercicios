import java.util.Scanner;

// 63 Clasificacion de notas por letra
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio63_Clasificacion_de_notas_por_letra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String L = "";

        System.out.println("Letra de calificacion (A, B, C, D, F):");
        L = entrada.nextLine();
        L = L.toUpperCase();
        if (((L.equals("A")))) {
            System.out.println("Nota entre 9.0 y 10.0");
        } else {
            if (((L.equals("B")))) {
                System.out.println("Nota entre 8.0 y 8.9");
            } else {
                if (((L.equals("C")))) {
                    System.out.println("Nota entre 7.0 y 7.9");
                } else {
                    if (((L.equals("D")))) {
                        System.out.println("Nota entre 6.0 y 6.9");
                    } else {
                        if (((L.equals("F")))) {
                            System.out.println("Nota entre 0.0 y 5.9");
                        } else {
                            System.out.println("Letra no valida");
                        }
                    }
                }
            }
        }
    }
}
