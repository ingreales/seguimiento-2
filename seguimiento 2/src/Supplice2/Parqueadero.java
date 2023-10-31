package Supplice2;

public class Parqueadero {
    private String carro;
    private int placa;
    private int horallegada;

    public Parqueadero(String carro, int placa, int horallegada) {
        this.carro = carro;
        this.placa = placa;
        this.horallegada = horallegada;
    }

    public Parqueadero(String Carro, int placa) {
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public int getPlaca() {
        return placa;
    }

    public int getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(int horallegada) {
        this.horallegada = horallegada;
    }

    @Override
    public String toString() {
        return "Parqueadero{" +
                "carro='" + carro + '\'' +
                ", placa='" + placa + '\'' +
                ", horallegada=" + horallegada +
                '}';
    }
}


