package TP1.EJ11;

import TP1.EJ11.JUEGO.Administrador;
import TP1.EJ11.JUEGO.Palabras;

public class main {
    public static void main(String[] args) {
        Palabras palabra = new Palabras();
        Administrador admin = new Administrador();
        //AGREGO PALABRAS AL DICCIONARIO

        System.out.println("AGREGO PALABRAS AL DICCIONARIO");
        admin.agregarPalabra("zorro");
        admin.agregarPalabra("galleta");
        admin.agregarPalabra("gato");
        admin.agregarPalabra("queso");
        admin.agregarPalabra("agua");

        //AGREGO PALABRAS AL JUGADOR N1
        System.out.println("PALABRAS JUGADOR N1 = GATO Y QUESO");
        admin.agregarPalabrasJugador("galleta",1);
        admin.agregarPalabrasJugador("queso",1);

        //AGREGO PALABRAS AL JUGADOR N2
        System.out.println("PALABRAS JUGADOR N2 = AGUA Y ZORRO");
        admin.agregarPalabrasJugador("agua",2);
        admin.agregarPalabrasJugador("zorro",2);

        //ANUCIO AL GANADOR
        System.out.println("---RESULTADOS---");
        admin.ganador();
        //MUESTRO EL DICCIONARIO
        admin.getDiccionario();
    }

}
