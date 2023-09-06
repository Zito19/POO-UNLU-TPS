package TP1.EJ11.JUEGO;

import TP1.EJ6.Clases.Libro;

import java.util.ArrayList;

public class Palabras {
    private String palabra;
    private int puntaje;
    private ArrayList<String> diccionario;
    public Palabras() {
        this.diccionario = new ArrayList<String>();
    }
    protected ArrayList<String> getDiccionario() {
        return diccionario;
    }


    protected void agregarPalabras(String palabra){
        diccionario.add(palabra);
    }

    protected int palabraValida(String palabra){
        if (diccionario.contains(palabra)){
            int puntaje = calcularPuntaje(palabra);
            return puntaje;
        }
        return -1;
    }

    protected int calcularPuntaje(String palabra) {
        int puntaje = palabra.length();
        for (char letra : palabra.toCharArray()) {
            if (letra == 'k' || letra == 'z' || letra == 'x' || letra == 'y' || letra == 'w' || letra == 'q') {
                puntaje++;
            }
        }
        return puntaje;
    }
    protected int obtenerPuntaje() {
        return puntaje;
    }
    protected void mostrarPalabras(){
        for ( String diccionario : diccionario) {
            System.out.println(diccionario);
        }
    }
}

