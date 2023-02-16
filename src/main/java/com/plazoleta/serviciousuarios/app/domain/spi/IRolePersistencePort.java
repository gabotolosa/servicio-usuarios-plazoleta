package com.plazoleta.serviciousuarios.app.domain.spi;

import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;

import java.util.List;

public interface IRolePersistencePort {

    void saveRole(RoleModel roleModel);
    List<RoleModel> getAllRole();
}
