package entidades;
import java.util.GregorianCalendar;
/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class Servicio {

    public Servicio(Habitacion habitacion, GregorianCalendar fechaServ, String descripcion, float costo) {
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

    public GregorianCalendar getFechaServ() {
        return fechaServ;
    }

    public void setFechaServ(GregorianCalendar fechaServ) {
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
    
    private Habitacion habitacion;
    private GregorianCalendar fechaServ;
    private String descripcion;
    private float costo;
    
}
