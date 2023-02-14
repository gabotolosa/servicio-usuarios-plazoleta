package com.plazoleta.serviciousuarios.app.application.dto.response;

import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private Long cellphone;
    private String email;
    private String password;
    private RoleModel idRole;
}
