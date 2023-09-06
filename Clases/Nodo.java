package TP1.Clases;

public class Nodo {
    private Object dato;
    private Nodo proximo = null;

    //constructor
    public Nodo(Object dato) {this.dato = dato;}
    public void setDato(Object dato) {
        this.dato = dato;
    //agrega el dato al nodo
    }
    public Object getDato() {
        return dato;
    }

    public void setproximo(Nodo nodo){
        this.proximo = nodo;
        //setea el proximo , hay q enviarle un nodo.
    }

    public Nodo getProximo() {
        return proximo;
    }

}
