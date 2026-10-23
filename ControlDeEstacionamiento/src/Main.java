import java.util.Scanner;
//Elaborado por Ian David Romero Castillo 22/10/2026
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int costoDescuento=10;
        int costoHora= 15;
        int horas  =0;
        double dineroRecaudado=0;
        int contadorCarros=1;
        int contadorCarrosDescuento=0;
        int costo ;


        do{
            System.out.println("Bienvenido eres el carro : "+contadorCarros);
            System.out.println("Ingresa las horas usadas en el estacionamiento: ");
            horas = teclado.nextInt();

            if(horas<0){
                System.out.println("No se permiten horas negativad");
            }else {
                if(horas>0) {
                    if (horas > 5) {
                        costo = horas * costoDescuento;

                        System.out.println("Estuviste mas de 5 horas");
                        System.out.println("Obtuviste un descuento de: " + costo);
                        contadorCarrosDescuento++;

                    } else {
                        costo = horas * costoHora;
                        System.out.println("Total a pagar: " + costo);

                    }

                    dineroRecaudado += costo;
                    contadorCarros++;
                }
            else {
                    System.out.println("Saliendo del programa...");
                    contadorCarros--;
                }
            }


        } while(horas!=0);{}
        double promedioDineroRecaudado=dineroRecaudado/contadorCarros;
        System.out.println("Total de automóviles atendidos: "+contadorCarros);
        System.out.println("Total de dinero recaudado: "+dineroRecaudado);
        System.out.println("Cantidad de automóviles que recibieron descuento: "+contadorCarrosDescuento);
        System.out.println("Promedio pagado por automóvil: "+promedioDineroRecaudado);
    }
}