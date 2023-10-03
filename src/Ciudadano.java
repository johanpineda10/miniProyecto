public class Ciudadano {
    private String nombre;
    private String cedula;
    private Ciudades ciudadOri;
    
    public Ciudadano(String nombre, String cedula, Ciudades ciudadOri) {
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

    public Ciudades getCiudadOri() {
        return ciudadOri;
    }

    public void setCiudadOri(Ciudades ciudadOri) {
        this.ciudadOri = ciudadOri;
    }

    

}
