package com.plazoleta.serviciousuarios.app.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RoleResponseDto {
    private Long id;
    private String name;
    private String details;
}
