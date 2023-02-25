package com.plazoleta.serviciousuarios.app.application.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String cellphone;
    private String email;
    private String password;
    private Long roleId;
}