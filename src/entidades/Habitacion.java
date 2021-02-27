package entidades;
import java.util.ArrayList;

/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class Habitacion implements Comparable<Habitacion>{

    public Habitacion(){}
    
    public Habitacion(int contPiso, Piso piso, float precioNoche, TipoHab tipo) {
        this.piso = piso;
        disponible = true;
        fechaIngreso = "";
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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
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
    
    public String displayBoleta(){
        float montoBoleta = 0.0f;
        if (!disponible) {
            String adicionales = "Ninguno";
            float montoservs = 0.0f;
            if (!getServicios().isEmpty()){
                adicionales = "";
                for (Servicio serv : getServicios()){
                    adicionales += serv.displayBoleta();
                    montoservs += serv.getCosto();
                }
            }
            montoBoleta += getPrecioNoche()*getDiasReserva() + montoservs;    
            return "Por concepto de:\n\n"
                    + "Servicio de Hospedaje.\nPrecio unitario: S/ " + getPrecioNoche() +
                    "\nPrecio total: S/" + getPrecioNoche()*getDiasReserva() +
                    "\nServicios adicionales: "+ adicionales + "\nPrecio total de servicios: S/" +
                    montoservs + "\n\nMonto total a cancelar: S/" + montoBoleta;
        } else {
            return "Habitación disponible.\nDatos insuficientes para generar boleta.";
        }
    }
    
    public int compareTo(Habitacion hab){
        if (numero == hab.numero)
            return 0;
        else if (numero > hab.numero)
            return 1;
        else
            return -1;
    }
    
    public void borrarEstadia(){
        huespedes.clear();
        servicios.clear();
        setDisponible(true);
        setDiasReserva(0);
    }
    
    public void setHuespPos(int pos, Huesped huesp){
        huespedes.set(pos, huesp);
    }

    public void addHuesp(Huesped huesp){
        huespedes.add(huesp);
    }
    
    public void addServ(Servicio serv){
        servicios.add(serv);
    }
    
    private int numero;
    private Piso piso;
    private boolean disponible;
    private float precioNoche;
    private String fechaIngreso;
    private int diasReserva;
    private TipoHab tipo;
    private ArrayList<Huesped> huespedes;
    private ArrayList<Servicio> servicios;
}
