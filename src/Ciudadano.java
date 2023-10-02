public class Ciudadano {
    private String nombre;
    private String cedula;
    private String ciudadOri;
    
    public Ciudadano(String nombre, String cedula, String ciudadOri) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ciudadOri = ciudadOri;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCiudadOri() {
        return ciudadOri;
    }

    public void setCiudadOri(String ciudadOri) {
        this.ciudadOri = ciudadOri;
    }

}
