package com.plazoleta.serviciousuarios.app.domain.model;

import com.plazoleta.serviciousuarios.app.domain.exception.DomainException;
import org.mindrot.jbcrypt.BCrypt;

import java.util.regex.Pattern;

public class UserModel {

    private Long userId;
    private String firstName;
    private String lastName;
    private String cellphone;
    private String email;
    private String password;
    private Long idRole;

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

    public UserModel() {
        super();
    }

    public UserModel(Long userId, String firstName, String lastName, String cellphone, String email, String password, Long idRole) {

        //validate userId
        if (userId <= 0){
            throw new DomainException("Id number");
        }

        //validate firstName
        if (firstName == null || firstName.trim().isEmpty()){
            throw new DomainException("firstName Not Empty");
        }

        //validate lastName
        if (lastName == null || lastName.trim().isEmpty()){
            throw new DomainException("firstName Not Empty");
        }

        //validate cellphone
        if(cellphone != null && !cellphone.isEmpty()){
            String phoneWithoutPlus = cellphone.replace("+", "");
            if (!phoneWithoutPlus.matches("[0-9]{0,13}")){
                throw new DomainException("cellphone numeric max 13 character");
            }
        }

        //validate email
        if (email == null || email.trim().isEmpty()){
            throw new DomainException("email Not Empty");
        }else {
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$");
            if (!pattern.matcher(email).matches()){
                throw new DomainException("The email does not have a valid format name@mail.com");
            }
        }

        //encrypt password
         String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.email = email;
        this.password = hashedPassword;
        this.idRole = idRole;
    }
}
