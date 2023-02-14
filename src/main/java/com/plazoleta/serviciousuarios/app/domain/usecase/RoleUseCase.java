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
    public RoleModel getRoleById(Long id) {
        return rolePersistencePort.getRoleById(id);
    }

    @Override
    public RoleModel getRoleByName(String name) {
        return rolePersistencePort.getRoleByName(name);
    }

    @Override
    public List<RoleModel> getAllRole() {
        return rolePersistencePort.getAllRole();
    }
}
