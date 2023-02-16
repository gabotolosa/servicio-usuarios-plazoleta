package com.plazoleta.serviciousuarios.app.domain.model;
public class UserModel {

    ValidationModel validationModel =  new ValidationModel();

    private Long userId;
    private String firstName;
    private String lastName;
    private String cellphone;
    private String email;
    private String password;
    private Long idRole;

    public UserModel() {
        super();
    }

    public UserModel(Long userId, String firstName, String lastName, String cellphone, String email, String password, Long idRole) {

        this.userId = validationModel.validateUserId(userId);
        this.firstName = validationModel.validate(firstName);
        this.lastName = validationModel.validate(lastName);
        this.cellphone = validationModel.validateCellphone(cellphone);
        this.email = validationModel.validateEmail(email);
        this.password = validationModel.hashedPassword(password);
        this.idRole = 2L;
    }

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

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
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

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }
}
