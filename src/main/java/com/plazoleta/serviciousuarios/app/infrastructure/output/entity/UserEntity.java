package com.plazoleta.serviciousuarios.app.infrastructure.output.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String firstName;

    @Column(name = "apellido", nullable = false, length = 50)
    private String lastName;

    @Column(name = "celular", nullable = false)
    @Size(max = 13, message = "Size max 13")
    private String cellphone;

    @Column(name = "correo", nullable = false)
    @Email(message = "invalid email format")
    private String email;

    @Column(name = "clave", nullable = false)
    private String password;

    @Column(name = "id_rol", nullable = false)
    private Long idRole;

}
