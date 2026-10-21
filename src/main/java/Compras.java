package org.Ivana;

import java.util.Scanner;

public class Compras
{

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            int opcion = 0;

            while (opcion != 2) {

                System.out.println("================================");
                System.out.println("       CAFETERIA ESCOLAR");
                System.out.println("================================");
                System.out.println("1. Registrar compra");
                System.out.println("2. Salir");
                System.out.println("================================");
                System.out.println("Seleccione una opcion:");

                opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {

                    case 1:

                        String nombre;
                        int productos;
                        int cantidad;
                        double precio;
                        double importe;
                        double subtotal = 0;
                        double descuento;
                        double total;

                        System.out.println("================================");
                        System.out.println("        REGISTRAR COMPRA");
                        System.out.println("================================");

                        System.out.println("Nombre del cliente:");
                        nombre = entrada.nextLine();

                        System.out.println("Cuantos productos diferentes comprara?");
                        productos = entrada.nextInt();

                        for (int i = 1; i <= productos; i++) {

                            System.out.println("Producto " + i);

                            System.out.println("Precio:");
                            precio = entrada.nextDouble();

                            System.out.println("Cantidad:");
                            cantidad = entrada.nextInt();

                            importe = precio * cantidad;
                            subtotal = subtotal + importe;

                            System.out.println("Importe: $" +
                                    String.format("%.2f", importe));
                        }

                        if (subtotal < 100) {
                            descuento = 0;
                        } else if (subtotal < 300) {
                            descuento = subtotal * 0.05;
                        } else {
                            descuento = subtotal * 0.10;
                        }

                        total = subtotal - descuento;

                        entrada.nextLine();

                        System.out.println("================================");
                        System.out.println("        RESUMEN DE COMPRA");
                        System.out.println("================================");
                        System.out.println("Cliente: " + nombre);
                        System.out.println("Subtotal: $" +
                                String.format("%.2f", subtotal));
                        System.out.println("Descuento: $" +
                                String.format("%.2f", descuento));
                        System.out.println("Total: $" +
                                String.format("%.2f", total));
                        System.out.println("================================");

                        break;

                    case 2:
                        System.out.println("Gracias por visitar la cafeteria.");
                        System.out.println("Hasta pronto.");
                        break;

                    default:
                        System.out.println("Opcion no valida. Intente nuevamente.");
                        break;
                }
            }

            entrada.close();
        }


}
