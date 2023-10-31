package Supplice2;

import Supplice.Computador;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Parqueadero> carros= () -> new Parqueadero(" Mazda",42);
        Parqueadero parqueadero = carros.get();
        System.out.println(" Marca: " +parqueadero.getCarro() + " Su número de Placa es: " + parqueadero.getPlaca());

    }
}
