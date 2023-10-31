package Biconsumer2;

public class Producto {
    private String TipoProducto;
    private int ID;

    public Producto(String tipoProducto, int ID) {
        TipoProducto = tipoProducto;
        this.ID = ID;
    }

    public String getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        TipoProducto = tipoProducto;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "TipoProducto='" + TipoProducto + '\'' +
                ", ID=" + ID +
                '}';
    }
}
