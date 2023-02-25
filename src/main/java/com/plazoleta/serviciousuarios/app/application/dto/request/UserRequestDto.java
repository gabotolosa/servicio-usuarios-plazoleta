package com.plazoleta.serviciousuarios.app.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRequestDto {
    private Long Id;
    private String firstName;
    private String lastName;
    private String cellphone;
    private String email;
    private String password;
    private Long idRole;
}
