package co.edu.udec.act3.albertovalenciasolis.gastos.domain.request;

import lombok.Data;

@Data
public class UsuarioRegistroRequest {
    private Integer idUsuario;
    private String cedula;
    private String password;
    private String nombre;
    private String apellido;
    private String genero;
    private String correo;
}
