package TP1.EJ6.Clases;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;
    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    public void agregarLibro(String titulo, String autor, int anio, String isbn, int paginas, int ejemplares) {
        Libro libro = new Libro(titulo, autor, anio, isbn, paginas, ejemplares);
        libros.add(libro);;
    }
    public void mostrarLibros(){
        for (Libro libro : libros) {
            libro.descripcion();
        }
    }
    public boolean prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.prestarLibro();
                return true;
            }
        }
        System.out.println("El libro "+titulo+" no se encuentra");
        return false;
    }
    public void descripcion(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.descripcion();
                return;
            }
        }
        System.out.println("El libro "+titulo+" no se encuentra");
    }//SIRVE PARA BUSCAR UN LIBRO TAMBIEN

    /*public ArrayList<Libro> buscarLibroTitulo(String titulo) {
        ArrayList<Libro> librosEncontrados = new ArrayList<Libro>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }*/
}

