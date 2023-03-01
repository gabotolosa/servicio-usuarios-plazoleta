package com.plazoleta.serviciousuarios.app.application.dto.response;

import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserResponseDto {
    private Long id;
    private Long dni;
    private String firstName;
    private String lastName;
    private String cellphone;
    private String email;
    private String password;
    private Long roleId;
    private List<RoleModel> roleModel;
}
