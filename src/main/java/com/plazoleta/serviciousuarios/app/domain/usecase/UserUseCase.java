package com.plazoleta.serviciousuarios.app.domain.usecase;

import com.plazoleta.serviciousuarios.app.domain.api.IUserServicePort;
import com.plazoleta.serviciousuarios.app.domain.model.Token;
import com.plazoleta.serviciousuarios.app.domain.model.UserModel;
import com.plazoleta.serviciousuarios.app.domain.spi.IPersistencePort;
import com.plazoleta.serviciousuarios.app.domain.spi.IUserPersistencePort;


import java.util.List;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;
    private final IPersistencePort persistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort, IPersistencePort persistencePort) {
        this.userPersistencePort = userPersistencePort;
        this.persistencePort = persistencePort;
    }

    @Override
    public Token loginUser(UserModel userModel){
        UserModel authenticateUser = userPersistencePort.getUserByEmailAndPassword(userModel);
        return persistencePort.loginUser(authenticateUser);
    }

    @Override
    public UserModel saveUser(UserModel userModel) {
        //UserValidator.validateSaveUser(userModel);
        String username = persistencePort.signupUser(userModel);
        userModel.setEmail(username);
        UserModel createdUser = userPersistencePort.saveUser(userModel);
        return createdUser;
    }

    @Override
    public List<UserModel> getAllUsers() {
        return userPersistencePort.getAllUsers();
    }

    @Override
    public UserModel getUserByEmail(String email) {
        return userPersistencePort.getUserByEmail(email);
    }

    @Override
    public void deleteUser(Long userId) {
        userPersistencePort.deleteUser(userId);
    }

}
