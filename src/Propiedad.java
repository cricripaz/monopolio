public class Propiedad {
    private boolean esHotel;
    private String nombre;
    private int valor;
    private String color;
    private boolean tieneDueno ;
    private boolean isPropiedad;

    public Propiedad() {
    }

    public Propiedad(boolean esHotel, String nombre, int valor, String color, boolean tieneDueno, boolean isPropiedad) {
        this.esHotel = esHotel;
        this.nombre = nombre;
        this.valor = valor;
        this.color = color;
        this.tieneDueno = tieneDueno;
        this.isPropiedad = isPropiedad;
    }


    public boolean isEsHotel() {
        return esHotel;
    }

    public void setEsHotel(boolean esHotel) {
        this.esHotel = esHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTieneDueno() {
        return tieneDueno;
    }

    public void setTieneDueno(boolean tieneDueno) {
        this.tieneDueno = tieneDueno;
    }

    public boolean isPropiedad() {
        return isPropiedad;
    }

    public void setPropiedad(boolean propiedad) {
        isPropiedad = propiedad;
    }
}
