import java.util.Scanner;

// 53 Clasificacion de temperatura en Loja
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio53_Clasificacion_de_temperatura_en_Loja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double T = 0;

        System.out.println("Temperatura en grados Celsius:");
        T = Double.parseDouble(entrada.nextLine().trim());
        if (((T < 15))) {
            System.out.println("Clima frio");
        } else {
            if (((T <= 25))) {
                System.out.println("Clima templado");
            } else {
                System.out.println("Clima calido");
                if (((T > 30))) {
                    System.out.println("Alerta: calor extremo");
                }
            }
        }
    }
}
