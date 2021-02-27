package entidades;

import java.util.ArrayList;
import java.util.Collections;

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
    
    public void addHab(Habitacion hab){
        habs.add(hab);
    }
    
    public void sortHabs(){
        Collections.sort(habs);
    }
    
    public void setHabPos(int pos, Habitacion hab){
        habs.set(pos, hab);
    }
    
    public void limpiarHabs(){
        habs.clear();
    }
    
    private String nombre;
    private String ruc;
    private ArrayList<Habitacion> habs;
    private int contp1 = 0;
    private int contp2 = 0;    
    private int contp3 = 0;
    private int contp4 = 0;

    public int getContp1() {
        return contp1;
    }

    public void setContp1(int contp1) {
        this.contp1 = contp1;
    }

    public int getContp2() {
        return contp2;
    }

    public void setContp2(int contp2) {
        this.contp2 = contp2;
    }

    public int getContp3() {
        return contp3;
    }

    public void setContp3(int contp3) {
        this.contp3 = contp3;
    }

    public int getContp4() {
        return contp4;
    }

    public void setContp4(int contp4) {
        this.contp4 = contp4;
    }
}
