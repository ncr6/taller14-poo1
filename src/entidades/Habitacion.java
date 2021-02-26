package entidades;
import java.util.GregorianCalendar;
import java.util.ArrayList;

/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class Habitacion {

    public Habitacion(int contPiso, Piso piso, float precioNoche, TipoHab tipo) {
        this.piso = piso;
        disponible = true;
        fechaIngreso = new GregorianCalendar();
        diasReserva = 0;
        this.precioNoche = precioNoche;
        this.tipo = tipo;
        huespedes = new ArrayList();
        servicios = new ArrayList();
        
        switch (piso){
            case PRIMERO:
                numero = 100 + contPiso;
                break;
            case SEGUNDO:
                numero = 200 + contPiso;
                break;
            case TERCERO:
                numero = 300 + contPiso;
                break;
            case CUARTO:
                numero = 400 + contPiso;
                break;
        }
    }

    public int getNumero() {
        return numero;
    }

    public Piso getPiso() {
        return piso;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public float getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(float precioNoche) {
        this.precioNoche = precioNoche;
    }

    public GregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getDiasReserva() {
        return diasReserva;
    }

    public void setDiasReserva(int diasReserva) {
        this.diasReserva = diasReserva;
    }

    public TipoHab getTipo() {
        return tipo;
    }

    public void setTipo(TipoHab tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Huesped> getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(ArrayList<Huesped> huespedes) {
        this.huespedes = huespedes;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    private int numero;
    private Piso piso;
    private boolean disponible;
    private float precioNoche;
    private GregorianCalendar fechaIngreso;
    private int diasReserva;
    private TipoHab tipo;
    private ArrayList<Huesped> huespedes;
    private ArrayList<Servicio> servicios;
}
