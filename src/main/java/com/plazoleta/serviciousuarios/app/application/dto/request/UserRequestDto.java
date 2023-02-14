package com.plazoleta.serviciousuarios.app.application.dto.request;

import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    private String firstName;
    private String lastName;
    private Long cellphone;
    private String email;
    private String password;
    private RoleModel idRole;
}
