package com.plazoleta.serviciousuarios.app.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RoleRequestDto {

    private String name;
    private String details;
}
