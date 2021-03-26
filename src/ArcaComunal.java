public class ArcaComunal {

    private String texto ;
    private String accion;
    private int valor ;


    public ArcaComunal(String texto, String accion, int valor) {
        this.texto = texto;
        this.accion = accion;
        this.valor = valor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
