package Consumer2;

public class Dispositivos {
    private String Celulares;

    public Dispositivos(String celulares) {
        Celulares = celulares;
    }

    public String getCelulares() {
        return Celulares;
    }

    public void setCelulares(String celulares) {
        Celulares = celulares;
    }

    @Override
    public String toString() {
        return "Dispositivos{" +
                "Celulares='" + Celulares + '\'' +
                '}';
    }
}
