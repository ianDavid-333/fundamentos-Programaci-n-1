import java.util.Scanner;
//Elaborado por Ian David Romero Castillo 30/10/2026
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Prueba 1 con datos ingresados desde el mismo codigo");
        mostrarEtiqueta(12 ,"Cuernavaca",33.33 );
        System.out.println("------------------************----------------------------");

        System.out.println("Prueba con datos dados por el usuario");
        System.out.println("Ingrese el número de guía: ");
        int numeroGuia= teclado.nextInt();
        System.out.println("Ingrese la ciudad de destino: ");
        String cuidadDestino= teclado.next();
        System.out.println(" Ingrese el peso del paquete en kilogramos: ");
        double pesoPaquete= teclado.nextDouble();

        mostrarEtiqueta(numeroGuia, cuidadDestino, pesoPaquete);


    }

    static void mostrarEtiqueta(int numeroGuia, String cuidadDestino, double pesoPaquete) {
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("Informacion del paquete");
        System.out.println("Número de guía: " + numeroGuia);
        System.out.println("Ciudad de destino: "+cuidadDestino);
        System.out.println(" Peso del paquete en kilogramos: "+pesoPaquete+" kg");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
    }
}