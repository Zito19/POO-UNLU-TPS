package TP1.Pruebas;

import TP1.clases.ListaEnlazada;

public class PruebaLista {
    public static void main(String[] args){
        System.out.println("Pruebas con Listas: Se carga la lista con numeros del 1 al 10 y una string");

        ListaEnlazada lista = new ListaEnlazada();

        for (int i = 1; i<10; i++){
            //int randomNumber = new Random().nextInt(10,100);
            lista.agregar(i);
        }
        //lista.agregarElemento(null);

        //AGREGAR ELEMENTOS
        System.out.println("-------------------------------------------------------------");
        lista.agregar("hola");
        System.out.println("Se imprimen los elementos de la lista");
        System.out.println(lista);
        System.out.println("-------------------------------------------------------------");

        //RECUPERAR ELEMENTOS
        System.out.println("-------------------------------------------------------------");
        System.out.println("Se utiliza el metodo recuperar, posicion numero 3: ");
        System.out.println("Elemento a recuperado : " + lista.recuperar(3).toString() + "\n");
        System.out.println("-------------------------------------------------------------");


        //ELIMINAR ELEMENTOS
        System.out.println("Se elimina el primer y quinto elemento de la lista\n");
        lista.eliminarDato(0);
        lista.eliminarDato(3);
        lista.eliminarDato(4);

        System.out.println("Se intenta eliminar el nodo con el valor 15.\n");
        if(!lista.eliminarDato(15)){
            System.out.println("No se pudo eliminar el elemento 15\n");
        }

        lista.eliminarDato("hola");
        System.out.println(lista);
        System.out.println("-------------------------------------------------------------");

        System.out.println("-------------------------------------------------------------");
        System.out.println("Se prueba el metodo insertar");
        System.out.println("Elemento actual en la pos 3: " + lista.recuperar(3).toString());
        System.out.println("Se inserta un elemento en la pos 3");
        lista.insertar(3, "Elemento Insertado");
        System.out.println("Elemento nuevo en la pos 3: " + lista.recuperar(3).toString());
        System.out.println("Elemento en la pos 4: " + lista.recuperar(4).toString());
        System.out.println("-------------------------------------------------------------\n");

        System.out.println("Se prueba el metodo insertar en la primera posicion");
        System.out.println(lista);

        System.out.println("Se prueba el metodo insertar en una posicion fuera de rango");
        if(!lista.insertar( -1, "Elemento Insertado 2")){
            System.out.println("1-No se pudo insertar el elemento\n");
        }

        if(!lista.insertar( lista.longitud() + 1, "Elemento Insertado 2")){
            System.out.println("2-No se pudo insertar el elemento\n");
        }
        System.out.println("Lista resultado final: \n");
        System.out.println("Logitud = " + lista.longitud());
        System.out.println(lista);




        System.out.println("Fin de pruebas");
    }
}


