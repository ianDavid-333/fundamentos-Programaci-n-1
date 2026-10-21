import java.util.Scanner;
//Elaborado por Ian David Romero Castillo 21/10/2026
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double contadorPuntos = 0;
        int contadorMasMil = 0;
        int contadormenosMil = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.println("-----------------------******************--------------------");
            System.out.println("Estas en la partida: " + i);
            System.out.println("Ingrese la cantidad de puntos en la partida "+i+" : ");
            double puntosPartida = teclado.nextDouble();
            contadorPuntos += puntosPartida;

            if (puntosPartida >1000){
                System.out.println("Partida de mas de mil puntos :3 !!!");
                contadorMasMil++;
            }else {
                System.out.println("Partida de menos de mil puntos ");
                contadormenosMil++;
            }
        }
        System.out.println("-----------------------******************--------------------");
        double promedio = contadorPuntos/7;
        System.out.println("Puntos totales: "+contadorPuntos);
        System.out.println("Promedio de puntos en las 7 partidas: "+promedio);
        System.out.println("Cantidad de partidas de mas de mil puntos: "+contadorMasMil);
        System.out.println("Cantidad de partidas con menos de mil puntos: "+contadormenosMil);
    }
}