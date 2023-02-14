package com.plazoleta.serviciousuarios.app.domain.spi;

import com.plazoleta.serviciousuarios.app.domain.model.UserModel;

import java.util.List;

public interface IUserPersistencePort {

    //Admin-Owner
    UserModel saveOwner(UserModel userModel);
    List<UserModel> getAllOwner(Long roleId);
    UserModel getOwnerById(Long id);
    UserModel updateOwner(UserModel userModel);
    void deleteOwner(Long id);

    //Admin-Restaurant
    void saveRestaurant();

    //Owner-Employee
    UserModel saveEmployee(UserModel userModel);
    List<UserModel> getAllEmployee(Long roleId);
    UserModel getEmployeeById(Long id);
    UserModel updateEmployee(UserModel userModel);
    void deleteEmployee(Long id);

    //customers (clientes)
    //List<Restaurant> getAllRestaurant();
    //List<Menu> getAllMenuByIdRestaurant();

    //Employee Order


}
