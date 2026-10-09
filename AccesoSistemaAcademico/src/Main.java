import java.util.Scanner;
//Elaborado por Ian David Romero Castillo 08/10/2026
public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingresa tu promedio:");
    double promedio = teclado.nextDouble();
    System.out.println("Ingresa el porcentaje de asistencia : %");
    int asistencia = teclado.nextInt();

    if (promedio >= 7 &&  asistencia>=80) {
        System.out.println("Aprobado regular");
    }else if (promedio < 7) {
        System.out.println("Reprobado por calificacion");
    }else if (asistencia < 80) {
        System.out.println("Reprobado por asistencia");
    }else {
        System.out.println("Reprobado por calificacion y asistencia");
    }


    }
}