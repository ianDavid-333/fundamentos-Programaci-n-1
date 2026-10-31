import java.util.Scanner;
//Elaborado por Ian David Romero Castillo 30/10/2026
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int porcentajeBateria;
        do {
            System.out.println("---------------*****************----------------------");
            System.out.println("Ingrese 333 para salir del programa");
            System.out.println("Ingrese el porcentaje de bateria: ");
            porcentajeBateria = teclado.nextInt();
            if (porcentajeBateria < 0 || porcentajeBateria > 100) {
                if (porcentajeBateria ==333) {
                    System.out.println("Saliendo del programa");
                }else {
                    System.out.println("Porcentaje de bateria no valido");
                }
            }else {
                int minutos = calcularMinutos(porcentajeBateria);
                System.out.println("se tardara en cargar " + minutos + " minutos");
                }
        }while(porcentajeBateria!=333);
    }

    static int calcularMinutos(int porcentajeBateria){
        int minutos = 0;
            while (porcentajeBateria <= 100) {
                if (porcentajeBateria != 100) {
                    minutos += 1;
                }
                porcentajeBateria += 8;
        }
        return minutos;
    }
}