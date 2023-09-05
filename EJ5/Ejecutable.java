package TP1.EJ5;

import java.time.LocalDate;

public class Ejecutable {
    public static void main(String[] args) {
        System.out.println("---Cargar tareas---");
        // Primera tarea con el tiempo de vencimiento para mañana.
        Tarea tarea1 = new Tarea("Ir al supermercado mañana", 1, LocalDate.now().plusDays(1));

        // Segunda tarea con el tiempo de vencimiento para ayer.
        Tarea tarea2 = new Tarea("Consultar repuesto del auto", 2, LocalDate.now().minusDays(1));

        // Tercera tarea con el tiempo de vencimiento para hoy.
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel", 3,  LocalDate.now().minusDays(1));

        // Cuarta tarea con el tiempo de vencimiento para  pasado mañana

        Tarea tarea4 = new Tarea("Ir al mecanico el lunes", 1,LocalDate.now().plusDays(2));

        tarea1.mostrarTarea();
        tarea2.mostrarTarea();
        tarea3.mostrarTarea();
        tarea4.mostrarTarea();

        System.out.println("---Completar Tareas---\n");

        tarea1.completarTarea();
        tarea2.completarTarea();
        tarea3.completarTarea();
        tarea4.completarTarea();

        System.out.println("--Cambio de descripcion y prioridad de la tarea numero 4 ---");
        tarea4.mostrarTarea();
        System.out.println("---Resultado---");

        tarea4.setDescripcion("ir al mecanico hoy");
        tarea4.setPrioridad(1);
        tarea4.tareaInfo();

        System.out.println("--Pregunto si la tarea 2 esta vencida o no---");
        if(tarea2.tareaVencida()){
            System.out.println("TAREA VENCIDA");
        }
        System.out.println("--Pregunto si la tarea 3 esta completa o n o");
        if(tarea3.tareaCompleta()){
            System.out.println("TAREA COMPLETA");
        }
        else{System.out.println("TAREA INCOMPLETA");}

        System.out.println("\nCONDICION FINAL DE LAS TAREAS \n");

        tarea1.tareaInfo();
        tarea2.tareaInfo();
        tarea3.tareaInfo();
        tarea4.tareaInfo();
    }
}
