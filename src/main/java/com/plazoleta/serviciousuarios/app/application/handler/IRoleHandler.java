package com.plazoleta.serviciousuarios.app.application.handler;

import com.plazoleta.serviciousuarios.app.application.dto.request.RoleRequestDto;
import com.plazoleta.serviciousuarios.app.application.dto.response.RoleResponseDto;

import java.util.List;

public interface IRoleHandler {
    void  saveRole(RoleRequestDto roleRequestDto);
    List<RoleResponseDto> getAllRoles();
}
