package TP1.Pruebas;

import TP1.clases.Cola;

public class PruebaCola {
    public static void main(String[] args){
        System.out.println("Pruebas con Colas: Se carga la cola con numeros aleatorios");

        Cola cola = new Cola();
        for (int i = 1; i<=10; i++){
            //int randomNumber = new Random().nextInt(10,100);
            cola.encolar(i);
        }

        while (!cola.esVacia()){
            System.out.println("Objeto: " + cola.recuperar());
            cola.desencolar();

        }
        //System.out.println("Objeto:" + cola.recuperar());

        if(cola.esVacia()){
            System.out.println("La cola esta vacia");
        }
    }
}
