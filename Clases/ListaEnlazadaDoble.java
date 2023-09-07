package TP1.Clases;

public class ListaEnlazadaDoble {
    private NodoDoble primero = null;
    private NodoDoble ultimo = null;
    private Integer longitud = 0;

    public boolean esVacia() {
        return (primero == null);
    }

    public Integer longitud() {
        return longitud;
    }

    public void agregar(Object dato) {
        NodoDoble nuevoNodo = new NodoDoble(dato);
        if (esVacia()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            nuevoNodo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        }
        longitud++;
    }

    public boolean eliminarDato(Object dato) {
        if (esVacia() || dato == null) {
            return false;
        }

        NodoDoble nodoAux = primero;
        while (nodoAux != null) {
            if (nodoAux.getDato().equals(dato)) {
                if (nodoAux == primero) {
                    primero = nodoAux.getSiguiente();
                    if (primero != null) {
                        primero.setAnterior(null);
                    } else {
                        ultimo = null;
                    }
                } else if (nodoAux == ultimo) {
                    ultimo = nodoAux.getAnterior();
                    if (ultimo != null) {
                        ultimo.setSiguiente(null);
                    } else {
                        primero = null;
                    }
                } else {
                    NodoDoble anterior = nodoAux.getAnterior();
                    NodoDoble siguiente = nodoAux.getSiguiente();
                    anterior.setSiguiente(siguiente);
                    siguiente.setAnterior(anterior);
                }
                longitud--;
                return true;
            }
            nodoAux = nodoAux.getSiguiente();
        }
        return false;
    }

    public Object recuperar(Integer pos) {
        if (esVacia() || pos < 1 || pos > longitud) {
            return null;
        }

        NodoDoble nodoAux = primero;
        for (int i = 1; i < pos; i++) {
            nodoAux = nodoAux.getSiguiente();
        }
        return nodoAux.getDato();
    }

    public boolean insertar(Integer pos, Object dato) {
        if (esVacia() || pos < 1 || pos > longitud + 1) {
            return false;
        }

        NodoDoble nuevoNodo = new NodoDoble(dato);
        if (pos == 1) {
            nuevoNodo.setSiguiente(primero);
            primero.setAnterior(nuevoNodo);
            primero = nuevoNodo;
        } else if (pos == longitud + 1) {
            nuevoNodo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
        } else {
            NodoDoble nodoAux = primero;
            for (int i = 1; i < pos; i++) {
                nodoAux = nodoAux.getSiguiente();
            }
            NodoDoble anterior = nodoAux.getAnterior();
            anterior.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(anterior);
            nuevoNodo.setSiguiente(nodoAux);
            nodoAux.setAnterior(nuevoNodo);
        }
        longitud++;
        return true;
    }

    public boolean reemplazar(Integer pos, Object nuevoDato) {
        if (esVacia() || pos < 1 || pos > longitud) {
            return false;
        }

        NodoDoble nodoAux = primero;
        for (int i = 1; i < pos; i++) {
            nodoAux = nodoAux.getSiguiente();
        }
        nodoAux.setDato(nuevoDato);
        return true;
    }

    public void datoSiguieteAnterior(int pos) {
        if (!esVacia()) {
            NodoDoble nodoAux = primero;
            System.out.println("DATO EN LA POSICION " + pos + " :" + recuperar(pos));
            if (pos == 1) {
                System.out.println("Anterior: null - Siguiente: " + nodoAux.getSiguiente().getDato());
            } else if (pos == longitud) {
                System.out.println("Anterior: " + nodoAux.getAnterior() + " - Siguiente: null ");
            } else {
                for (int i = 1; i < pos; i++) {
                    nodoAux = nodoAux.getSiguiente();
                }
                System.out.println("Anterior: " + nodoAux.getAnterior().getDato() + " - Siguiente: " + nodoAux.getSiguiente().getDato());
            }
        }
    }

    public String toString() {
        String acumulador = "";
        Integer i = 1;
        NodoDoble nodoAux = primero;
        if (primero == null) {
            acumulador = "Lista vacía";
        } else {
            while (nodoAux != null) {
                acumulador += "Nodo N." + i + " Dato: " + nodoAux.getDato() + "\n";
                i++;
                nodoAux = nodoAux.getSiguiente();
            }
        }
        return acumulador;
    }
}
