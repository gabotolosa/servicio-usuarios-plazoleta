package com.plazoleta.serviciousuarios.app.domain.spi;

import com.plazoleta.serviciousuarios.app.domain.model.UserModel;

import java.util.List;

public interface IUserPersistencePort {
    UserModel saveUser(UserModel userModel);
    List<UserModel> getAllUsers();
    UserModel getUserByEmail(String email);
    UserModel getUserByEmailAndPassword(UserModel userModel);
    void deleteUser(Long userId);


}
