package Biconsumer;

import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("julio","general");
        Pacientes pacientes = new Pacientes("santiago","gripa",23);

        BiFunction<Hospital,Pacientes,String> Hospital=(H, P) ->{
            H.getEspecializacion();
            return P.getNombre() + " tiene "+ P.getEnfermedad()  + " la edad es " + P.getEdad() +
                     " fue asignado a el doctor " +  H.getNombredoctor() + " su especializacion es " +
                    H.getEspecializacion();

        };
        System.out.println(Hospital.apply(hospital,pacientes));
    }
}
