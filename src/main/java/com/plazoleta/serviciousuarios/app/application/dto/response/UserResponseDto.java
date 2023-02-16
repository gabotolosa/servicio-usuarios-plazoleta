package com.plazoleta.serviciousuarios.app.application.dto.response;
import com.plazoleta.serviciousuarios.app.domain.api.IUserServicePort;
import com.plazoleta.serviciousuarios.app.domain.model.UserModel;
import com.plazoleta.serviciousuarios.app.domain.spi.IUserPersistencePort;

import java.util.List;

public class UserResponseDto implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;

    public UserResponseDto(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void saveUserModel(UserModel userModel) {
        userPersistencePort.saveUserModel(userModel);
    }

    @Override
    public List<UserModel> getAllUser() {
        return userPersistencePort.getAllUser();
    }
}
