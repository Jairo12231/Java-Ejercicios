import java.util.Scanner;

// 61 Dia de la semana y tipo de actividad
// Versión sencilla en Java del ejercicio de PSeInt
public class Ejercicio61_Dia_de_la_semana_y_tipo_de_actividad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String D = "";
        int N = 0;
        String T = "";
        boolean V = false;

        System.out.println("Ingrese el dia (1 a 7):");
        N = Integer.parseInt(entrada.nextLine().trim());
        V = true;
        if (((N == 1))) {
            D = "Lunes";
        } else {
            if (((N == 2))) {
                D = "Martes";
            } else {
                if (((N == 3))) {
                    D = "Miercoles";
                } else {
                    if (((N == 4))) {
                        D = "Jueves";
                    } else {
                        if (((N == 5))) {
                            D = "Viernes";
                        } else {
                            if (((N == 6))) {
                                D = "Sabado";
                            } else {
                                if (((N == 7))) {
                                    D = "Domingo";
                                } else {
                                    V = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (V) {
            if (((N <= 5))) {
                T = "Dia de clases";
            } else {
                T = "Fin de semana";
            }
            System.out.println("Dia: " + "" + D);
            System.out.println("Actividad: " + "" + T);
        } else {
            System.out.println("Numero de dia no valido");
        }
    }
}
