package entidades;
import java.util.Calendar;
/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class Servicio {

    public Servicio(Habitacion habitacion, Calendar fechaServ, String descripcion, float costo) {
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

    public Calendar getFechaServ() {
        return fechaServ;
    }

    public void setFechaServ(Calendar fechaServ) {
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
    private Calendar fechaServ;
    private String descripcion;
    private float costo;
    
}
