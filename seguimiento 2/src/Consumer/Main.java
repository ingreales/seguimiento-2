package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String>Carros= new ArrayList<>();

        Carros.add("bmw");
        Carros.add("mazda");
        Carros.add("ford");

        Consumer<String>consumer = carros -> System.out.println(" estos son mis carros favoritos " + carros );

        consumer.accept(Carros.toString());
    }
}
