package co.edu.autonoma.app1.springboot_application.controllers;

public class ParametroDTO {

    private String informacion;

    

    public ParametroDTO() {
    }

    public ParametroDTO(String informacion) {
        this.informacion = informacion;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    
}
