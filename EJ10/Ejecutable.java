package TP1.EJ10;

import TP1.EJ5.Tarea;

import java.time.LocalDate;
import java.util.spi.CalendarDataProvider;

public class Ejecutable {
    public static void main(String[] args){
    String description = "IR AL MECANICO";
    int prioridad = 4;

    System.out.println("Se cargan dos tareas");
    //TAREA 1
    LocalDate fechaLimite = LocalDate.of(2023, 12, 5);
    LocalDate recordatorio = LocalDate.of(2023, 12, 1);
    Tarea2 tarea1 = new Tarea2(description, prioridad,fechaLimite,recordatorio);
    tarea1.tareaInfo();
    //TAREA
        description = "IR AL SUPERMERCADO";
        prioridad = 2;
    fechaLimite = LocalDate.of(2023, 12, 5);
    recordatorio = LocalDate.of(2023, 9, 6);
    Tarea2 tarea2 = new Tarea2(description, prioridad,fechaLimite,recordatorio);
    tarea2.tareaInfo();


    System.out.println("Actualizacion del recordatorio seguna las tareas");
    tarea1.actualizarTareas();
    tarea2.actualizarTareas();
    tarea1.tareaInfo();
    tarea2.tareaInfo();

    System.out.println(tarea1.recordatorioActivo() ? "true" : "false");
    System.out.println(tarea2.recordatorioActivo() ? "true" : "false");
    }
}