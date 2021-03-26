public class Jugador {
    private String nombre ;
    private int dinero;
    private int cantidadPropiedades;


    public Jugador(String nombre, int dinero, int cantidadPropiedades) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.cantidadPropiedades = cantidadPropiedades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getCantidadPropiedades() {
        return cantidadPropiedades;
    }

    public void setCantidadPropiedades(int cantidadPropiedades) {
        this.cantidadPropiedades = cantidadPropiedades;
    }
}
