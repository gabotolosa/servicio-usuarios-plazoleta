package com.plazoleta.serviciousuarios.app.domain.api;

import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;

import java.util.List;

public interface IRoleServicePort {

    void saveRole(RoleModel roleModel);
    RoleModel getRoleById(Long id);
    RoleModel getRoleByName(String name);
    List<RoleModel> getAllRole();

}
