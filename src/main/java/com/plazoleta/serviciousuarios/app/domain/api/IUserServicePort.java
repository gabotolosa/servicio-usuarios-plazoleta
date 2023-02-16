package com.plazoleta.serviciousuarios.app.domain.api;

import com.plazoleta.serviciousuarios.app.domain.model.UserModel;

import java.util.List;

public interface IUserServicePort {

    void saveUserModel(UserModel userModel);
    List<UserModel> getAllUser();

}
