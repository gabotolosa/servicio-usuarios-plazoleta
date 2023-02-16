package com.plazoleta.serviciousuarios.app.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RoleRequestDto {
    private Long roleId;
    private String name;
    private String details;
}
