import java.util.Scanner;
// Programa elaborado por Ian David Romero Castillo 14/10/2026
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el piso actual:");
        int pisoActual = teclado.nextInt();

        System.out.println("Ingrese el piso de destino:");
        int pisoDestino = teclado.nextInt();

        int contador = pisoActual;

        if (pisoActual<=0 || pisoDestino<=0){
            if(pisoActual<0 || pisoDestino<0){
                System.out.println("No puedes ir ni estar en pisos negativos");
            }else if(pisoActual==0){
                System.out.println("No puedes estar en el piso 0");
            }else {
                System.out.println("No puedes ir al piso 0");
            }
        }
        else{
            if(pisoActual>11 || pisoDestino>11){
                System.out.println("El edificio tiene solo 11 pisos");
            }else{
                if(pisoDestino==pisoActual){

                    System.out.println("No puedes ir al mismo piso");
                }else{

                    if(pisoDestino>=pisoActual){
                        contador = pisoActual+1;
                        System.out.println("Vas del piso "+pisoActual+" a "+pisoDestino);
                        while(contador<=pisoDestino){
                            System.out.println("Estas en el piso "+ contador);
                            contador++;
                        }
                    }else {
                        System.out.println("Vas del piso "+pisoActual+" a "+pisoDestino);
                        contador = pisoActual-1;
                        while (contador>=pisoDestino){
                            System.out.println("Estas en el piso "+ contador);
                            contador--;
                        }
                    }
                }
            }
        }
    }
}