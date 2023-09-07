package TP1.Clases;

public class NodoDoble {
    private Object dato;
    private NodoDoble anterior;
    private NodoDoble siguiente;

    public NodoDoble(Object dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public Object datoAnterior(){
        return anterior.getDato();
    }
    public Object datoSiguiente(){
        return anterior.getDato();
    }
}