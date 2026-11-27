public class Main {
    //Elaborado por Ian David Romero Castillo 26/11/2026
    public static void main(String[] args) {
        int[] calificaciones = {55, 68, 72, 90, 61, 98, 45, 77, 83, 59};
        mostrarOriginal(calificaciones);
        AplicarLaCurva(calificaciones);
        mostrarModificado(calificaciones);
        Aprobados(calificaciones);
    }

    public static void mostrarOriginal(int[] calificaciones) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Alumno " +i+ " : " + calificaciones[i-1]);
        }

    }

    public static void AplicarLaCurva(int[] calificaciones) {

        for (int i = 0; i < 10; i++) {
            calificaciones[i] += 5;
            if (calificaciones[i] > 100) {
                calificaciones[i] = 100;

             }
        }

    }
    public static void mostrarModificado(int[] calificaciones) {

        System.out.println("Calificaciones despues de la curva:  ");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Alumno " +i+ " : " + calificaciones[i-1]);
        }
    }

    public static void Aprobados(int[] calificaciones) {
        int aprobados = 0;
        for (int i = 1; i <= 10 ; i++) {
            if (calificaciones[i-1] >= 70) {
                aprobados++;
            }
        }
        System.out.println("Total de alumnos aprobados :  "+aprobados);
    }
}