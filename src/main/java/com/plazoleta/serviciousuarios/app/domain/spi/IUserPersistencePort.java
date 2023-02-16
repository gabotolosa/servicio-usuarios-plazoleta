package com.plazoleta.serviciousuarios.app.domain.spi;

import com.plazoleta.serviciousuarios.app.domain.model.UserModel;

import java.util.List;

public interface IUserPersistencePort {

    UserModel saveUserModel(UserModel userModel);
    List<UserModel> getAllUser();

}
