import java.time.LocalDate;

public class Tarea{

    private String nombre;
    private LocalDate fechaVencimiento;
    private int prioridad;
    private boolean completada;

    public Tarea(){
    }
    
    public Tarea(String nombre, LocalDate fechaVencieminto, int prioridad, boolean completada){
            this.nombre = nombre;
            this.fechaVencimiento = fechaVencieminto;
            this.prioridad = prioridad;
            this.completada = completada;
    }
    public Tarea(String nombre, LocalDate fechaVencimiento, int prioridad){
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.prioridad = prioridad;
    }
    public String getNombre (){
        return nombre;  
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public LocalDate getFechaVencimiento(){
        return fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento){
        this.fechaVencimiento = fechaVencimiento; 
    }
    public int getPrioridad(){
        return prioridad;
    }
    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }
    public boolean isCompletada(){
        return completada;
    }
    public void setCompletada(boolean completada){
        this.completada = completada;
    }

}