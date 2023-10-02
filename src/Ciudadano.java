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
        System.out.println("Ingrese su nombre: ");
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        System.out.println("Ingrese su numero de cedula");
        this.cedula = cedula;
    }

    public Ciudades getCiudadOri() {
        return ciudadOri;
    }

    public void setCiudadOri(Ciudades ciudadOri) {
        System.out.println("Ingrese su ciudad de origen");
        this.ciudadOri = ciudadOri;
    }

    

}
