package com.plazoleta.serviciousuarios.app.application.handler;

import com.plazoleta.serviciousuarios.app.application.dto.request.UserRequestDto;
import com.plazoleta.serviciousuarios.app.application.dto.response.UserResponseDto;

import java.util.List;

public interface IUserHandler {
    void saveUser(UserRequestDto userRequestDto);
    List<UserResponseDto> getAllUsers();
}
