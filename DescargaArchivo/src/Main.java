import java.util.Scanner;
//Elaborado por Ian David Romero Castillo 30/10/2026
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del archivo en MB: ");
        double tamañoArchivo = teclado.nextDouble();
        System.out.println("Ingrese la velocidad de descarga en MB por segundo: ");
        double velocidadDescarga=teclado.nextDouble();

        if (tamañoArchivo<0 || velocidadDescarga<=0){
            System.out.println("Error");
            if (tamañoArchivo<0){
                System.out.println("Tamaño del archivo negativa");
            }else{
                System.out.println("Velocidad 0 o negativa");
            }
        }
        else {
            double segundos = calcularTiempo(tamañoArchivo, velocidadDescarga);
            System.out.println("El tiempo estimado de descarga en segundos es: " + segundos);
        }
    }


    static double calcularTiempo(double tamañoArchivo, double velocidadDescarga) {
        double segundos = tamañoArchivo/velocidadDescarga;
        return segundos;
    }
}