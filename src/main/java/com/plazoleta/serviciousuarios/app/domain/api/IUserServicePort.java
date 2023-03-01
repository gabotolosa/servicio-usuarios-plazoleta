package com.plazoleta.serviciousuarios.app.domain.api;

import com.plazoleta.serviciousuarios.app.domain.model.Token;
import com.plazoleta.serviciousuarios.app.domain.model.UserModel;

import java.util.List;

public interface IUserServicePort {

    Token loginUser(UserModel userModel);
    UserModel saveUser(UserModel userModel);
    List<UserModel> getAllUsers();
    UserModel getUserByEmail(String email);
    void deleteUser(Long userId);
}
