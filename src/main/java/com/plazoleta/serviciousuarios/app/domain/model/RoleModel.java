package com.plazoleta.serviciousuarios.app.domain.model;

public class RoleModel {

    private Long roleId;
    private String name;
    private String details;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public RoleModel() {
        super();
    }

    public RoleModel(Long roleId, String name, String details) {
        this.roleId = roleId;
        this.name = name;
        this.details = details;
    }
}
