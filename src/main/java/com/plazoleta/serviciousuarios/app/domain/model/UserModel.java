package com.plazoleta.serviciousuarios.app.domain.model;

import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;

public class UserModel {

    private Long userId;
    private String firstName;
    private String lastName;
    private Long cellphone;
    private String email;
    private String password;
    private RoleModel idRole;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getCellphone() {
        return cellphone;
    }

    public void setCellphone(Long cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleModel getIdRole() {
        return idRole;
    }

    public void setIdRole(RoleModel idRole) {
        this.idRole = idRole;
    }

    public UserModel() {
        super();
    }

    public UserModel(Long userId, String firstName, String lastName, Long cellphone, String email, String password, RoleModel idRole) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.email = email;
        this.password = password;
        this.idRole = idRole;
    }
}
