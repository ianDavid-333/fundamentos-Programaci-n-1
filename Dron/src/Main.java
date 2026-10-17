import java.util.Scanner;
//Programa elaborado por Ian David Romero Castillo Ian David 16/10/2026
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el porcentaje de bateria del dron: % ");
        int bateriaDron = teclado.nextInt();
        if (bateriaDron < 0 || bateriaDron > 100) {
            System.out.println("Porcentaje de bateria del dron incorrecto");
            if (bateriaDron < 0 ) {
                System.out.println("Porcentaje de bateria menor a 0");
            }else {
                System.out.println("Porcentaje de bateria mayor a 100");
            }
        }else{
            System.out.println("---------------------------************************-------------------------");
            System.out.println("Porcentaje de bateria del dron: "+bateriaDron+"%");
           if (bateriaDron < 7) {
               System.out.println("Porcentaje de bateria menor para un minuto de vuelo");
           } else {

               int contadorMinuto = 1;
               int contadorBateriaDron = bateriaDron - 7;
               while (contadorBateriaDron >= 0) {
                   System.out.println("Minuto " + contadorMinuto + " -> " + contadorBateriaDron + "% ");
                   contadorMinuto++;
                   contadorBateriaDron -= 7;
               }
               System.out.println("Se termino la bateria ");
           }
        }
    }
}