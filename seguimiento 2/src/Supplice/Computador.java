package Supplice;

public class Computador {
    private String Usuario;
    private int Clave;

    public Computador(String usuario, int clave) {
        Usuario = usuario;
        Clave = clave;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public int getClave() {
        return Clave;
    }

    public void setClave(int clave) {
        Clave = clave;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "Usuario='" + Usuario + '\'' +
                ", Clave=" + Clave +
                '}';
    }
}
