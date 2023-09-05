package TP1.clases;
public class ListaEnlazada {
    private Nodo primero = null;
    private Integer longitud = 0;

    public boolean esVacia(){return (primero == null);}

    public Integer longitud(){return longitud;}
    public void agregar(Object dato){
        Nodo nuevoNodo = new Nodo(dato);// genera un nuevo objeto nodo y agrega el dato
        //primera instancia
        if (primero == null){
            primero = nuevoNodo;
            longitud += 1;
        }
        // si no es el primero de la lista
        else{
            Nodo nodoAux = primero; //Tomo el primer nodo de la lista

            while(nodoAux.getProximo() != null){ //si el nodo es null no entra.
                nodoAux = nodoAux.getProximo();//pasa al siguiente nodo valido.
            }
            nodoAux.setproximo(nuevoNodo);//agrega el nuevo nodo a la lista.
            longitud += 1;
        }
    }

    public boolean eliminarDato(Object dato){
        if(esVacia() || dato == null){
            return false;
        }
        Nodo nodoAux;
        nodoAux = primero;
        Nodo nodoAnterior = new Nodo(null);

        while (nodoAux != null)
        {
            if(nodoAux.getDato().equals(dato)){
                //Primer caso.
                if(nodoAnterior.getDato() == null){
                    primero = nodoAux.getProximo();
                    longitud -= 1;
                    return true;
                }
                //sino puenteo.
                nodoAnterior.setproximo(nodoAux.getProximo());
                longitud -=1;
                return true;
            }
            //corte de control del while.
            nodoAnterior = nodoAux; //asigno al anterior nodo aux
            nodoAux = nodoAux.getProximo();//asigno el siguiente al nodo

        } // FIN DEL BUCLE
        return false;
    }

    public Object recuperar(Integer pos){
        if(this.esVacia()){return null;}
        if (pos > this.longitud || pos < 1){return null;}

        // si no devuleve por vacia o fuera de rango.
        //entra al bucle for y devuelve la posicion correspondiente.
        Nodo nodoAux = primero;
        int i;
        for(i = 1; i <= pos; i++){
            if(i==pos){
                return nodoAux.getDato();
            }
            nodoAux = nodoAux.getProximo();
        }
        return null;
    }

    public boolean insertar(Integer pos ,Object dato){
        if (this.esVacia()){ return false;}
        if (pos > this.longitud || pos < 1){ return false;}

        Nodo nuevoNodo = new Nodo(dato);
        Nodo nodoAux = primero;
        Nodo anterior = primero;
        if(pos == 1){ nuevoNodo.setproximo(primero);
            primero = nuevoNodo;
            longitud +=1;
            return true;
        }
        int i;
        for(i=1;i<= pos;i++){
            if(pos == i){
                nuevoNodo.setproximo(nodoAux);
                anterior.setproximo(nuevoNodo);
                //if(pos == 1){primero = nuevoNodo;}
                longitud +=1;
                return true;
            }
            anterior = nodoAux;
            nodoAux = nodoAux.getProximo();
        }
        return false;
    }
    public String toString(){
        //imprime por pantalla la lista de los nodos.
        String acumulador = "";//acumulador de strings.
        Integer i = 1;
        Nodo nodoAux = primero;
        if(primero == null){
            acumulador = "lista Vacia ";
        }
        else{
        while(nodoAux != null){
            acumulador += "Nodo N."+ i + " Dato: " + nodoAux.getDato() + "\n";
            i++;
            nodoAux = nodoAux.getProximo();
        }
        }
        return acumulador;
    }
}