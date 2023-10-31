package Consumer2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String>Dispositivos = new ArrayList<>();

        Dispositivos.add("Samsung");
        Dispositivos.add("Iphone");
        Dispositivos.add("Nokia");
        Consumer<String>consumer = dispositivos ->  System.out.println("Celulares con mejor rendimiento " + dispositivos );
        consumer.accept(Dispositivos.toString());
    }
}
