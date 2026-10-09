import java.util.Scanner;
//Elaborado por Ian David Romero Castillo 08/10/2026
public class Main {
    public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);

    System.out.println("Ingrese la temperatura en grados Celsius:");
    double temperatura= teclado.nextDouble();



    if(temperatura < 10) {
        System.out.println("Frio extremo");
    } else if(temperatura >= 10 && temperatura <= 20) {
        System.out.println("Clima fresco");
    }else if(temperatura >= 21 && temperatura <= 30) {
        System.out.println("Clima agradable");
    }else {
        System.out.println("Calor extremo");
    }

    }
}