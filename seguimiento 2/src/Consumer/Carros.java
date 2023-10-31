package Consumer;

public class Carros {
    private String tipos_de_carros;

    public Carros(String tipos_de_carros) {
        this.tipos_de_carros = tipos_de_carros;
    }

    public String getTipos_de_carros() {
        return tipos_de_carros;
    }

    public void setTipos_de_carros(String tipos_de_carros) {
        this.tipos_de_carros = tipos_de_carros;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "tipos_de_carros='" + tipos_de_carros + '\'' +
                '}';
    }
}
