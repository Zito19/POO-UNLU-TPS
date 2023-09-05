package TP1.clases;

public class Pila {
    private Nodo tope = null;

    public boolean esVacia(){return tope == null;}

    public void apilar(Object dato){
        Nodo newNodo = new Nodo(dato);
        if(!this.esVacia()){
            newNodo.setproximo(tope);
        }
        tope = newNodo;
    }
    public Object desapilar(){
        if (this.esVacia()){
            return null;
        }
        Nodo nodoAux = tope;
        tope = tope.getProximo();
        return nodoAux.getDato();
    }

    public Object recuperar(){
        if(this.esVacia()){
            return "La pila esta vacia";
        }
        return tope.getDato();
    }
}
