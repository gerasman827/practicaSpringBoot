package co.edu.autonoma.app1.springboot_application.models.dto;

public class ClaseDTO {
    private String titulo, usuario;

    public ClaseDTO() {
    }

    public ClaseDTO(String titulo, String usuario) {
        this.titulo = titulo;
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
}
