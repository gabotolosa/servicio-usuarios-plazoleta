package com.plazoleta.serviciousuarios.app.application.dto.response;

import com.plazoleta.serviciousuarios.app.domain.api.IRoleServicePort;
import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;
import com.plazoleta.serviciousuarios.app.domain.spi.IRolePersistencePort;

import java.util.List;

public class RoleResponseDto implements IRoleServicePort {

    private final IRolePersistencePort rolePersistencePort;

    public RoleResponseDto(IRolePersistencePort rolePersistencePort) {
        this.rolePersistencePort = rolePersistencePort;
    }

    @Override
    public void saveRole(RoleModel roleModel) {
        rolePersistencePort.saveRole(roleModel);
    }

    @Override
    public List<RoleModel> getAllRole() {
        return rolePersistencePort.getAllRole();
    }
}
