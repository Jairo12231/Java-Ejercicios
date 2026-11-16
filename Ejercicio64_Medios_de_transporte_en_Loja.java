import java.util.Scanner;

// 64 Medios de transporte en Loja
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio64_Medios_de_transporte_en_Loja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String C = "";
        int O = 0;
        int T = 0;

        System.out.println("1. Bus urbano");
        System.out.println("2. Taxi");
        System.out.println("3. Bicicleta");
        System.out.println("4. Caminar");
        O = Integer.parseInt(entrada.nextLine().trim());
        if (((O == 1))) {
            T = 30;
            C = "Economico, depende de las paradas";
        } else {
            if (((O == 2))) {
                T = 15;
                C = "Comodo, sujeto al trafico";
            } else {
                if (((O == 3))) {
                    T = 25;
                    C = "Activo y sin combustible";
                } else {
                    if (((O == 4))) {
                        T = 60;
                        C = "Saludable, requiere mas tiempo";
                    } else {
                        T = -1;
                        C = "Opcion no valida";
                    }
                }
            }
        }
        if (((T >= 0))) {
            System.out.println("Tiempo aproximado: " + "" + String.valueOf(T) + "" + " minutos");
        }
        System.out.println(C);
    }
}
