package TP1.EJ10;
import TP1.EJ5.Tarea;
import java.time.LocalDate;

public class Tarea2 extends Tarea {

    private LocalDate fechaRecordatorio;
    public Tarea2(String descrpicion, int prioridad, LocalDate fechaLimite,LocalDate recordatorio){
        super(descrpicion, prioridad, fechaLimite);
        this.fechaRecordatorio = recordatorio;
    }

    public boolean recordatorioActivo(){
        if(fechaRecordatorio.equals(LocalDate.now())){
          return true;
        }
        return fechaRecordatorio.isBefore(LocalDate.now());
    }
    public void actualizarTareas(){
        if(this.estado == Estado.completa || this.estado == Estado.vencida){
            return;
        }
        if(this.estado == Estado.incompleta || this.estado == Estado.porVencer){
            if(recordatorioActivo()){
                this.estado = Estado.porVencer;
                this.prioridad = 1;
            }
        }
    }
}