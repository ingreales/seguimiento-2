package Supplice;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Computador> Usuarios= () -> new Computador(" Los niches",1881);
        Computador computador = Usuarios.get();
        System.out.println(" nombre: " +computador.getUsuario() + " Su numero de PIN es: " + computador.getClave());

    }
}
