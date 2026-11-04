import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int pesoPaquete = 0;
        String tipoEnvio ="";
        int precio=0;
        int paquetesAceptados= 0;
        int paquetesRechazados = 0;
        int paquetesFragilesAceptados= 0;
        int recaudacion=0;
        int costoMasAlto=0;


        do {
            System.out.println("-------------------********************----------------");
            System.out.println("Ingresa el peso del paquete en Kg: ");
            pesoPaquete= teclado.nextInt();
            if (pesoPaquete<=0){
                if (pesoPaquete==0){
                    System.out.println("Saliendo...");

                }else {
                    System.out.println("Tipo de dato incoreccto");
                    paquetesRechazados++;
                }
            }else{

                int conta=0;
                do {
                    System.out.println("Elija su opcion");
                    System.out.println("1 Local");
                    System.out.println("2 Nacional");
                    System.out.println("3 Express");
                    int eleccion = teclado.nextInt();


                    switch (eleccion) {
                        case 1:
                            conta++;
                            if (pesoPaquete <= 12) {
                                tipoEnvio="Local";
                                System.out.println("Paquete aceptado");
                                precio = 30 + 8 * pesoPaquete;


                            } else {
                                System.out.println("Paquete Rechazado");
                                paquetesRechazados++;

                            }

                            break;
                        case 2:
                            conta++;
                            if (pesoPaquete <= 20) {
                                tipoEnvio="Nacional";
                                System.out.println("Ingresa el peso del paquete:");
                                precio = 50 + 12 * pesoPaquete;

                            } else {
                                System.out.println("Paquete Rechazado");
                                paquetesRechazados++;

                            }
                            break;

                        case 3:
                            conta++;
                            if (pesoPaquete <= 5) {
                                tipoEnvio="Express";
                                precio = 80 + 20 * pesoPaquete;

                            } else {
                                System.out.println("Paquete Rechazado");
                                paquetesRechazados++;

                            }
                            break;

                        default:
                            System.out.println("Error ; eleccion no valida");

                    }
                }while (conta!=1);
                if (precio>0) {
                    System.out.println("El paquete es fragil : 1 si, 2 no");
                    int esFragil = teclado.nextInt();

                    int cont = 0;
                    while (cont == 0) {
                        if (esFragil == 1) {
                            precio += 25;
                            recaudacion =recaudacion+precio;
                            paquetesFragilesAceptados++;
                            paquetesAceptados++;
                            cont++;
                        } else if (esFragil == 2) {
                            recaudacion = recaudacion+precio;
                            cont++;
                            paquetesAceptados++;
                        } else {
                            System.out.println("Eleccion incorecta");
                            System.out.println("El paquete es fragil : 1 si, 2 no");
                            esFragil = teclado.nextInt();
                        }
                    }

                    System.out.println("Tipo de envio: " + tipoEnvio);
                    System.out.println("Peso del paquete: " + pesoPaquete + " kg");
                    System.out.println("Total a pagar: $" + precio);
                    if (esFragil == 1) {
                        System.out.println("El paquete es fragil");
                        int antesPrecio = precio - 25;
                        System.out.println("Se le sumaron  $25");
                        System.out.println("El precio original era : " + antesPrecio);
                    }
                    if (precio > costoMasAlto) {
                        costoMasAlto = precio;
                    }
                }
            }

        }while (pesoPaquete !=0);

        System.out.println("-------------------********************----------------");
        System.out.println("                     ¡Datos Finales! ");
        System.out.println("Paquetes Aceptados: "+paquetesAceptados);
        System.out.println("Paquetes Rechazados: "+paquetesRechazados);
        System.out.println("Paquete fragiles acetados: "+paquetesFragilesAceptados);
        System.out.println("Dinero Recaudado: $"+ recaudacion);
        System.out.println("El costo mas alto fue de $"+costoMasAlto);



    }
}