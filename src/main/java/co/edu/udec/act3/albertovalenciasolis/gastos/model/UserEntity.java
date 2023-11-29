package co.edu.udec.act3.albertovalenciasolis.gastos.model;

import co.edu.udec.act3.albertovalenciasolis.gastos.model.enums.Genero;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class UserEntity {
    @Id
    @Column(name = "id_usr")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsr;

    @Column(name = "cc_usr")
    private String documentoUsuario;

    @Column(name = "pass_usr")
    private String passwordUsuario;

    @Column(name = "nombre_usr")
    private String nombreUsuario;

    @Column(name = "apellido_usr")
    private String apellidoUsuario;

    @Column(name = "genero_usr")
    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Column(name = "email_usr")
    private String correoUsuario;
}
