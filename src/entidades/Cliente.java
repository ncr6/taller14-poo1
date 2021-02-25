package entidades;

/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class Cliente {

    public Cliente(String nombres, String apellidos, String tipoDoc, String numDoc, String telf) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.telf = telf;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }
    
    private String nombres;
    private String apellidos;
    private String tipoDoc;
    private String numDoc;
    private String telf;
}
