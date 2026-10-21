import java.util.Scanner;
//Elaborado por Ian David Romero Castillo 20/10/2026
public class Main {
    public static void main(String[] args) {
         Scanner treclado = new Scanner(System.in);
         int puntos = 100;
         int eleccion = 0;
         do {
             System.out.println("------------------*********************-----------------");

             System.out.println("1. Ganar 20 puntos\n" +
                     "2. Gastar 15 puntos\n" +
                     "3. Consultar puntos\n" +
                     "4. Salir");
             System.out.println("Ingrese su eleecion: ");
             eleccion = treclado.nextInt();
             if (eleccion == 2 && puntos < 15) {
                 System.out.println("Los puntos son menores a 15");
                 System.out.println("No puedes endeudarte ");
             } else {
                     switch (eleccion) {
                         case 1:
                             System.out.println("*-----------------------*");
                             System.out.println("| Gano 20 puntos :3 !!! | ");
                             System.out.println("*-----------------------*");
                             puntos = puntos + 20;

                             break;
                         case 2:
                             puntos = puntos - 15;
                             System.out.println("*-----------------*");
                             System.out.println("| Gasto 15 puntos |");
                             System.out.println("*-----------------*");
                             break;
                         case 3:
                             System.out.println("*-------------------------*");
                             System.out.println("| Sus puntos son: "+puntos+"|");
                             System.out.println("*-------------------------*");
                             break;
                         case 4:
                             System.out.println("Saliendo ...");
                             break;

                         default:
                             System.out.println("Opcion no valida");
                     }
                 }
             }
             while (eleccion != 4) ;
             {

             }
             System.out.println("Sus puntos finales son: " + puntos);


    }
}