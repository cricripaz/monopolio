public class Jugador {
    private String nombre ;
    private int dinero = 1000;
    private int cantidadPropiedades =0;
    private int posicion =0 ;


    public Jugador(String nombre, int dinero, int cantidadPropiedades, int posicion) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.cantidadPropiedades = cantidadPropiedades;
        this.posicion = posicion;
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

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
