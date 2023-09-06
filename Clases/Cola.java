package TP1.Clases;

public class Cola {

    private Nodo head = null;
    private Nodo tail = null;

    public boolean esVacia(){return head == null;}
    public void encolar(Object dato){
        Nodo newNodo = new Nodo(dato);
        if (esVacia()){
            head = newNodo;
            tail = newNodo;
            return;
        }
        tail.setproximo(newNodo);
        tail = newNodo;
    }
    public Object desencolar(){
        if (esVacia()){
            return null;
        }
        Nodo nodoAux = head;
        head = head.getProximo();
        return nodoAux.getDato();
    }
    public Object recuperar(){
        if(esVacia()){return "La cola esta vacia";}
        return head.getDato();
    }
}
