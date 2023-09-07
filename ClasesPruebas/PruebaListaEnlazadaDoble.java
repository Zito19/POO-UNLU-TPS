package TP1.ClasesPruebas;

import TP1.Clases.ListaEnlazadaDoble;

public class PruebaListaEnlazadaDoble {
  public static void main(String[] args) {
    ListaEnlazadaDoble lista = new ListaEnlazadaDoble();

    // Agrego elementos a la lista
    lista.agregar("1");
    lista.agregar("2");
    lista.agregar("3");

    // Imprimir la lista
    System.out.println("Lista original:");
    System.out.println(lista);

    // Recuperar un elemento de la lista
    Object elemento = lista.recuperar(2);
    System.out.println("Elemento en la posición 2: " + elemento);

    // Reemplazar un elemento en la lista
    lista.reemplazar(1, "reemplazo");
    System.out.println("Lista después de reemplazar el elemento:");
    System.out.println(lista);

    // Insertar un elemento en una posición específica
    lista.insertar(2, "Elemento insertado");
    System.out.println("Lista después de insertar un elemento:");
    System.out.println(lista);

    // Eliminar un elemento de la lista
    boolean eliminado = lista.eliminarDato("Elemento 3");
    System.out.println("Elemento 3 eliminado: " + eliminado);
    System.out.println("Lista después de eliminar un elemento:");
    System.out.println(lista);

    System.out.println("Dato siguiente y anterior del elemento n2:");
    lista.datoSiguieteAnterior(2);
  }
}
