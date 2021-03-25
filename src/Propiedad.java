public class Propiedad {
    private boolean esHotel;
    private String nombre;
    private double valor;
    private String color;

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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Propiedad(boolean esHotel, String nombre, double valor , String color) {
        this.esHotel = esHotel;
        this.nombre = nombre;
        this.valor = valor;
        this.color = color;
    }
}
