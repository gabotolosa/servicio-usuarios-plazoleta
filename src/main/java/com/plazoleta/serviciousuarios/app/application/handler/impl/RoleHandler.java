package com.plazoleta.serviciousuarios.app.application.handler.impl;

import com.plazoleta.serviciousuarios.app.application.dto.request.RoleRequestDto;
import com.plazoleta.serviciousuarios.app.application.dto.response.RoleResponseDto;
import com.plazoleta.serviciousuarios.app.application.handler.IRoleHandler;
import com.plazoleta.serviciousuarios.app.application.mapper.IRoleRequestMapper;
import com.plazoleta.serviciousuarios.app.application.mapper.IRoleResponseMapper;
import com.plazoleta.serviciousuarios.app.domain.api.IRoleServicePort;
import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class RoleHandler implements IRoleHandler {

    private final IRoleServicePort roleServicePort;
    private final IRoleRequestMapper roleRequestMapper;
    private final IRoleResponseMapper roleResponseMapper;


    @Override
    public void saveRole(RoleRequestDto roleRequestDto) {
        RoleModel roleModel = roleRequestMapper.toRole(roleRequestDto);
        roleServicePort.saveRole(roleModel);
    }

    @Override
    public List<RoleResponseDto> getAllRoles() {

        return roleResponseMapper.toResponseList(roleServicePort.getAllRoles());
    }
}
