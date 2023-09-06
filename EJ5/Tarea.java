package TP1.EJ5;

import java.time.LocalDate;

public class Tarea {

    protected String descripcion;
    protected int prioridad;
    protected LocalDate fechaLimite;
    protected LocalDate fechaCompletada;
    protected Estado estado;
    public enum Estado{
        incompleta,completa,vencida,porVencer;
        @Override
        public String toString(){
            return switch (this){
                case incompleta -> "Incompleta";
                case completa -> "Completa";
                case vencida -> "Vencida";
                case porVencer -> "Por vencer";
                default -> throw new IllegalArgumentException();
            };
        } // FIN TO STRING
    } // FIN ENUM ESTADO

    //CONSTRUCTOR
    //Puede ingresar una fecha limite como no. determina el estado de la tarea
    public Tarea(String descripcion,int prioridad){
        this(descripcion,prioridad,null);
    }
    public Tarea(String descripcion, int prioridad, LocalDate fechalimite){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechalimite;
        //SI NO HAY FECHA LIMITE, LA TAREA ESTA INCOMPLETA
        if(fechaLimite == null){
            this.estado = Estado.incompleta;
            return;
        }

        // SI LA FECHA LIMITE YA PASO, LA TAREA ESTA VENCIDA
        if(fechaLimite.isBefore(LocalDate.now())){
            this.estado = Estado.vencida;
        }

        // SINO LA FECHA LIMITE TODAVIA NO PASO Y LA TAREA ESTA INCOMPLETA.
        else{
            this.estado = Estado.incompleta;
        }
    }
    //SETTER Y GETTERS.
    public void setDescripcion(String descripcion){this.descripcion = descripcion;}
    public String getDescripcion(){return descripcion;}
    public void setPrioridad(int prioridad) {this.prioridad = prioridad;}
    public int getPrioridad(){return prioridad;}
    public Estado getEstado(){return this.estado;}
    // FUNCIONES
    public void completarTarea(){
        if(this.estado == Estado.completa){
            return;
        }
        this.fechaCompletada = LocalDate.now();
        if(this.fechaLimite.isBefore(LocalDate.now())){
            this.estado = Estado.vencida;
            return;
        }
        this.estado = Estado.completa;
    }
    public void tareaInfo(){
        System.out.println("Tarea: " + getDescripcion() +
                "\n Estado: " + getEstado() +
                ".\n Prioridad: " + getPrioridad() +
                ".\n Fecha de vencimiento: " + (this.fechaLimite == null ? " Sin definir " : this.fechaLimite+"\n")
        );
    }
    public void mostrarTarea(){
        /*Además, podemos querer mostrar la tarea, en cuyo caso muestra la descripción.
        Pero, si la tarea está terminada, el mensaje debería iniciar con el string "(Vencida)...".
        */
        System.out.println("Tarea: "+ getEstado() + "| Descripcion: "+ getDescripcion()+"\n");
    }
    public boolean tareaVencida(){return this.estado == Estado.vencida;}
    public boolean tareaCompleta(){return this.estado == Estado.completa;}
}
