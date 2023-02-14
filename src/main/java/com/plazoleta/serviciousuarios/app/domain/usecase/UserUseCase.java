package com.plazoleta.serviciousuarios.app.domain.usecase;

import com.plazoleta.serviciousuarios.app.domain.api.IUserServicePort;
import com.plazoleta.serviciousuarios.app.domain.model.UserModel;
import com.plazoleta.serviciousuarios.app.domain.spi.IUserPersistencePort;

import java.util.List;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void saveOwner(UserModel userModel) {
        userPersistencePort.saveOwner(userModel);
    }

    @Override
    public List<UserModel> getAllOwner(Long roleId) {
        return userPersistencePort.getAllOwner(roleId);
    }

    @Override
    public UserModel getOwnerById(Long id) {
        return userPersistencePort.getOwnerById(id);
    }

    @Override
    public void updateOwner(UserModel userModel) {
        userPersistencePort.updateOwner(userModel);
    }

    @Override
    public void deleteOwner(Long id) {
        userPersistencePort.deleteOwner(id);
    }

    @Override
    public void saveRestaurant() {

    }

    @Override
    public void saveEmployee(UserModel userModel) {
        userPersistencePort.saveEmployee(userModel);
    }

    @Override
    public List<UserModel> getAllEmployee(Long roleId) {
        return userPersistencePort.getAllEmployee(roleId);
    }

    @Override
    public UserModel getEmployeeById(Long id) {
        return userPersistencePort.getEmployeeById(id);
    }

    @Override
    public void updateEmployee(UserModel userModel) {
        userPersistencePort.updateEmployee(userModel);
    }

    @Override
    public void deleteEmployee(Long id) {
        userPersistencePort.deleteEmployee(id);
    }
}
