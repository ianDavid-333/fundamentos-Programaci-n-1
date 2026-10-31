import java.util.Scanner;
//Elaborado por Ian David Romero Castillo 30/10/2026
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la tarifa de alquiler por hora:");
        int tarifaHora = teclado.nextInt();
        System.out.println("Ingrese las horas:");
        int horas = teclado.nextInt();

        if (tarifaHora <=0 || horas <=0) {
            if (tarifaHora <=0) {
                System.out.println("La tarifa es menor o igual a 0");
            }
            else {
                System.out.println("La hora es menor o igual a 0");
            }
        }else{

            int total= calcularRenta(tarifaHora, horas);
            mostrarComprovante(tarifaHora, horas, total);

        }

    }

    static int calcularRenta(int tarifaHora, int horas) {
        int total = tarifaHora*horas;
        return total;
    }

    static void mostrarComprovante(int tarifaHora, int horas, int total) {


        System.out.println("-------------------*************------------------------");
        System.out.println("Comprobante de la renta de la camara");
        System.out.println("Tarifa de alquiler por hora: "+tarifaHora);
        System.out.println("Cantidad de horas de uso: "+horas);
        System.out.println("El total a pagar es:"+total);
        System.out.println("-------------------*************------------------------");

    }
}