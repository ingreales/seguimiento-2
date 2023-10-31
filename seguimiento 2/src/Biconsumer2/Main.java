package Biconsumer2;

import Biconsumer.Hospital;
import Biconsumer.Pacientes;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("arroz",123456);
        Cliente cliente = new Cliente("alvaro", 109264567);

        BiFunction<Producto,Cliente,String> Producto=(P, C) ->{
            return C.getNombre()  + " compro " + P.getTipoProducto() + " con la id del producto " + P.getID() + " con su cedula  " + C.getCedula();
        };
        System.out.println(Producto.apply(producto,cliente));
    }
}
