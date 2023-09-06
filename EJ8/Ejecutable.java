package TP1.EJ8;

import TP1.EJ8.Contrasenias.AdminContrasenias;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        // MENU
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        boolean estado = true;
        int cantidad,longitud;
        for(int i=0; estado ;i++) {


            System.out.print("Digite la cantidad de contrasenias a generar : ");
            cantidad = teclado.nextInt();
            System.out.print("Digite la longitud de la/s contrasenia/s : ");
            longitud = teclado.nextInt();

            //EJERCICIO
            AdminContrasenias admin = new AdminContrasenias();
            boolean contra = admin.generarContrasenias(cantidad,longitud);
            System.out.println(contra ? "Se generaron correctamente las contrasenias\n" : "Error longitud o cantidad no aceptable\n");
            if (contra) {
                admin.mostrarContrasenias();

                System.out.println("---CORRECCION DE CONTRASENIAS DEBILES A FUERTES---");
                admin.correctorContrasenias();
                admin.mostrarContrasenias();
            }
            // PARTE DEL MENU
            System.out.println("");
            System.out.print("¿Desea continuar? para continuar digite si: ");
            respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("si")) {
                estado = true;
            } else {
                estado = false;

            }
        }
    }
}
