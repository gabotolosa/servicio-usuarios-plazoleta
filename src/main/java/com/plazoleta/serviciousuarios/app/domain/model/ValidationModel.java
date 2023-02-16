package com.plazoleta.serviciousuarios.app.domain.model;

import com.plazoleta.serviciousuarios.app.domain.exception.DomainException;
import org.mindrot.jbcrypt.BCrypt;

import java.util.regex.Pattern;

public class ValidationModel {

   protected Long validateUserId(Long userId){
        if (userId <= 0){
            throw new DomainException("Id type number");
        }
        return userId;
    }

    protected String validate(String variable){
        if (variable == null || variable.trim().isEmpty()){
            throw new DomainException("variable Not null, Not Empty");
        }
        return variable;
    }

    protected String validateCellphone(String cellphone){
        if(cellphone != null && !cellphone.isEmpty()){
            String phoneWithoutPlus = cellphone.replace("+", "");
            if (!phoneWithoutPlus.matches("[0-9]{0,13}")){
                throw new DomainException("cellphone numeric max 13 character");
            }
        }
        return cellphone;
    }

    protected String validateEmail(String email){
        if (email == null || email.trim().isEmpty()){
            throw new DomainException("email Not Empty");
        }
        Pattern emailPattern = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
        if (!emailPattern.matcher(email).matches()){
            throw new DomainException("The email does not have a valid format username@domain.com");
        }
        return email;
    }

    protected String hashedPassword(String password){
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        return hashedPassword;
    }
}
