import java.util.Scanner;
//Programa elaborado por Ian David Romero Castillo 08/10/2026
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final double porcentajeDescuento= 0.2;
        String tipoBicicleta="";
        int bicicletaCosto=0;
        boolean tieneMenbresia = false;

        System.out.println("1. Bicicleta urbana: $40 por hora\n" +
                "2. Bicicleta de montaña: $60 por hora\n" +
                "3. Bicicleta eléctrica: $90 por hora\n");
        System.out.println("Ingrese su tipo de bicicleta: ");
        int eleccionBicicleta = teclado.nextInt();

        switch (eleccionBicicleta) {
            case 1:
                System.out.println("Su eleccion fue la bicicleta urbana");
                System.out.println("Con costo de $40 por hora");
                bicicletaCosto = 40;
                tipoBicicleta = "Bicicleta urbana";
                break;
            case 2:
                System.out.println("Su eleccion fue la bicicleta de montaña");
                System.out.println("Con costo de $60 por hora");
                bicicletaCosto = 60;
                tipoBicicleta="Bicicleta de montaña";
                break;
            case 3:
                System.out.println("Su eleccion fue la bicicleta electrica");
                System.out.println("Con costo de $90 por hora");
                bicicletaCosto = 90;
                tipoBicicleta="Bicicleta electrica";
                break;
            default:
                System.out.println("Tipo de bicicleta incorrecto");
        }
        if (bicicletaCosto> 0){

            System.out.println("Ingrese la cantidad de horas:");
            int cantidadHoras = teclado.nextInt();

            if (cantidadHoras > 0) {
                int subTotal= cantidadHoras* bicicletaCosto;

                System.out.println("¿Posee membresia ? 1.-si , 0.- no ");
                int eleccionMembresia = teclado.nextInt();
                tieneMenbresia = (eleccionMembresia== 1);

                System.out.println("------------*****************---------------");
                System.out.println("Datos finales");
                System.out.println("El tipo de bicicleta seleccionado fue: "+tipoBicicleta);
                System.out.println("El sutotal apagar es: $"+subTotal);
                if (tieneMenbresia) {
                    double descuento= subTotal*porcentajeDescuento;
                    double costoFinal = subTotal - descuento;
                    System.out.println("Tiene un descuento de: $"+descuento);
                    System.out.println("Su total a pagar es: $"+costoFinal);

                }else{
                    System.out.println("No posee membresia");
                    System.out.println("Su total a pagar es: $"+subTotal);

                }
            }else {
                System.out.println("La cantidad de horas es invalida");
            }
        }

    }
}