package TP1.EJ6;

import TP1.EJ6.Clases.Biblioteca;

public class Ejecutable {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        System.out.println("---AGREGO LA SIRENITA---");
        // agrego la sirenita
        biblioteca.agregarLibro("la sirenita","fito paez",1980,"1292ABC",150,15);

        biblioteca.descripcion("la sirenita");

        System.out.println("---AGREGO LA DRACULA---");
        // agrego dracula
        biblioteca.agregarLibro("dracula","maradona",1986,"AJB7231",215,10);

        biblioteca.descripcion("dracula");
        System.out.println("---BUSCO UN LIBRO QUE NO EXISTETE---");
        biblioteca.descripcion("NO DATA");

        System.out.println("---PRESTO LIBROS---");
        //presto 15 libros de la sirenita
        for (int i =0;i<15;i++) {
        biblioteca.prestarLibro("la sirenita");
        }

        //presto 1 de dracula
        biblioteca.prestarLibro("dracula");
        System.out.println("---RESULTADO FINAL---");
        //resultados finales
        biblioteca.mostrarLibros();

    }
}
