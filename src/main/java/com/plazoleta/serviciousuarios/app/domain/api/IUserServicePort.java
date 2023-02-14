package com.plazoleta.serviciousuarios.app.domain.api;

import com.plazoleta.serviciousuarios.app.domain.model.UserModel;

import java.util.List;

public interface IUserServicePort {

    //Admin-Owner
    void saveOwner(UserModel userModel);
    List<UserModel> getAllOwner(Long roleId);
    UserModel getOwnerById(Long id);
    void updateOwner(UserModel userModel);
    void deleteOwner(Long id);

    //Admin-Restaurant
    void saveRestaurant();

    //Owner-Employee
    void saveEmployee(UserModel userModel);
    List<UserModel> getAllEmployee(Long roleId);
    UserModel getEmployeeById(Long id);
    void updateEmployee(UserModel userModel);
    void deleteEmployee(Long id);

    //customers (clientes)
    //List<Restaurant> getAllRestaurant();
    //List<Menu> getAllMenuByIdRestaurant();

    //Employee Order


}
