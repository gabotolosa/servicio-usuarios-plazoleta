package com.plazoleta.serviciousuarios.app.domain.usecase;

import com.plazoleta.serviciousuarios.app.domain.api.IRoleServicePort;
import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;
import com.plazoleta.serviciousuarios.app.domain.spi.IRolePersistencePort;

import java.util.List;

public class RoleUseCase implements IRoleServicePort {

    private final IRolePersistencePort rolePersistencePort;

    public RoleUseCase(IRolePersistencePort rolePersistencePort) {
        this.rolePersistencePort = rolePersistencePort;
    }

    @Override
    public void saveRole(RoleModel roleModel) {
        rolePersistencePort.saveRole(roleModel);
    }

    @Override
    public List<RoleModel> getAllRoles() {
        return rolePersistencePort.getAllRoles();
    }

    @Override
    public RoleModel getRoleById(Long roleId) {
        return rolePersistencePort.getRoleById(roleId);
    }

    @Override
    public void deleteRole(Long roleId) {
        rolePersistencePort.deleteRole(roleId);
    }
}
