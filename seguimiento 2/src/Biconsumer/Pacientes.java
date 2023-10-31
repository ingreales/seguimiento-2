package Biconsumer;

public class Pacientes {
    private String nombre;
    private String enfermedad;
    private int edad;

    public Pacientes(String nombre, String enfermedad, int edad) {
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "nombre='" + nombre + '\'' +
                ", enfermedad='" + enfermedad + '\'' +
                ", edad=" + edad +
                '}';
    }
}
