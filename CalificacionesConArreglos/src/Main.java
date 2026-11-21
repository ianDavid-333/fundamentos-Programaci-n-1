import java.util.Scanner;
//Programa elaborado por Ian David Romero Castillo Ian David 21/11/2026

public class Main {
    public static void main(String[] args) {


        int[] calificaciones = registrarCalificaciones();
        mostrarCalificacion(calificaciones);
        System.out.println("Alumnos aprobados: "+aprovados(calificaciones) );
        System.out.println("Alumnos reprobados: "+reprovados(calificaciones) );


    }


    static int[] registrarCalificaciones() {
        Scanner teclado = new Scanner(System.in);
        int[] calificaciones = new int[10];
        int i = 1;

        do {

            System.out.println("Captura la calificación del alumno "+i + " (0 a 100 ): ");
            int calificacion = teclado.nextInt();
            if (calificacion < 0 || calificacion > 100) {
                System.out.println("calificacion incorecta ");
                if (calificacion < 0) {
                    System.out.println("Calificacion menor que 0 ");
                } else {
                    System.out.println("Calificacion mayor que 100");
                }
            } else {
                calificaciones[i - 1] = calificacion;
                i++;
            }

        } while (i <= 10);
        return calificaciones;
    }

    static void  mostrarCalificacion(int[] calificaciones) {
        System.out.println("Calificaciones capturadas:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Alumno "+i+" : "+calificaciones[i-1]);
        }
    }
    static int aprovados(int[] calificaciones) {
        int contAprovados=0;
        for (int i = 1; i <= 10; i++) {
            if (calificaciones[i - 1] >= 70) {
                contAprovados++;
            }
        }
        return contAprovados;
    }

    static int reprovados(int[] calificaciones) {
        int contReprovados=0;
        for (int i = 1; i <= 10; i++) {
            if(calificaciones[i-1]< 70 ){
                contReprovados++;
            }
        }
        return contReprovados;
    }
}