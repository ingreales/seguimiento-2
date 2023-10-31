package Biconsumer;

public class Hospital {
    private String nombredoctor;
    private  String especializacion;

    public Hospital(String nombredoctor, String especializacion) {
        this.nombredoctor = nombredoctor;
        this.especializacion = especializacion;
    }

    public String getNombredoctor() {
        return nombredoctor;
    }

    public void setNombredoctor(String nombredoctor) {
        this.nombredoctor = nombredoctor;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nombredoctor='" + nombredoctor + '\'' +
                ", especializacion='" + especializacion + '\'' +
                '}';
    }
}
