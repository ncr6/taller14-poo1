package entidades;

import java.util.ArrayList;

/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class Hotel {

    public Hotel(String nombre, String ruc) {
        this.nombre = nombre;
        this.ruc = ruc;
        habs = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public ArrayList<Habitacion> getHabs() {
        return habs;
    }
    
    public void setHabs(ArrayList<Habitacion> habs) {
        this.habs = habs;
    }
    
    private String nombre;
    private String ruc;
    private ArrayList<Habitacion> habs;
}
