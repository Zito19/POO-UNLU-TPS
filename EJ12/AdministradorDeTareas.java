package TP1.EJ12;

import TP1.Clases.ListaEnlazada;
import TP1.EJ5.Tarea;

import java.time.LocalDate;

class AdministradorDeTareas {

    private Tarea tarea;
    private ListaEnlazada lista = new ListaEnlazada();

    public void crearTarea(String descripcion, int prioridad, LocalDate fechaLimite) {
        tarea = new Tarea(descripcion, prioridad, fechaLimite);
        lista.agregar(tarea);
    }








  /*Necesitamos también crear un administrador de tareas para nuestra lista,
   que me permita crear nuevas tareas y agregarlas a una lista. Se necesita
   que retorne la lista de tareas no vencidas ordenadas primero según la prioridad
   y luego según la fecha de vencimiento. Debe permitir la búsqueda de tareas por título,
    y dada una tarea poder marcarla como realizada.
   */
}