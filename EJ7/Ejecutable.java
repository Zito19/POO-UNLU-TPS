package TP1.EJ7;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        boolean estado = true;
        String respuesta;
        int contador = 0;
        for(int i=0; estado ;i++) {
            System.out.print("Digite el valor del NUMERO A : ");
            a = teclado.nextDouble();
            System.out.print("Digite el valor del NUMERO B : ");
            b = teclado.nextDouble();
            System.out.print("Digite el valor del NUMERO C : ");
            c = teclado.nextDouble();
            Raices raiz = new Raices(a, b, c);

            raiz.calcular();
            System.out.println("");
            System.out.print("¿Desea continuar? : ");
            respuesta = teclado.next();
            contador++;
            if (respuesta.equalsIgnoreCase("si")) {
                estado = true;
            } else {
                estado = false;
                System.out.println("Cantidad de veces que se calculo la ecuacion : " + contador);
            }
        }
    }
}