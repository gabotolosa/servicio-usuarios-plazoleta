package com.plazoleta.serviciousuarios.app.domain.model;

public class RoleModel {

    private Long Id;
    private String name;
    private String details;

    public RoleModel() {
        super();
    }

    public RoleModel(Long id, String name, String details) {
        Id = id;
        this.name = name;
        this.details = details;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
}
