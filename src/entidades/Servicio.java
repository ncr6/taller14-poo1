package entidades;
/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class Servicio {

    public Servicio(Habitacion habitacion, String fechaServ, String descripcion, float costo) {
        this.habitacion = habitacion;
        this.fechaServ = fechaServ;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public String getFechaServ() {
        return fechaServ;
    }

    public void setFechaServ(String fechaServ) {
        this.fechaServ = fechaServ;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    public String displayBoleta(){
        return "Descripción: " + getDescripcion() +
                "\nFecha: " + getFechaServ() +
                "\nCosto unitario: S/ " + getCosto() + "\n";
    }
    
    private Habitacion habitacion;
    private String fechaServ;
    private String descripcion;
    private float costo;
    
}
