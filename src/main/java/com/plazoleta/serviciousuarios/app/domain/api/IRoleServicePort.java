package com.plazoleta.serviciousuarios.app.domain.api;

import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;

import java.util.List;

public interface IRoleServicePort {

    void saveRole(RoleModel roleModel);
    List<RoleModel> getAllRoles();
    RoleModel getRoleById(Long roleId);
    void deleteRole(Long roleId);
}
