package com.plazoleta.serviciousuarios.app.application.handler;

import com.plazoleta.serviciousuarios.app.application.dto.request.UserLoginRequestDto;
import com.plazoleta.serviciousuarios.app.application.dto.request.UserSignupRequestDto;
import com.plazoleta.serviciousuarios.app.application.dto.response.UserLoginResponseDto;
import com.plazoleta.serviciousuarios.app.application.dto.response.UserResponseDto;

import java.util.List;

public interface IUserHandler {
    UserLoginResponseDto loginUser(UserLoginRequestDto userLoginRequestDto);
    void saveUser(UserSignupRequestDto userSignupRequestDto);
    List<UserResponseDto> getAllUsers();
    UserResponseDto getUserByEmail(String email);
    void deleteUser(Long userId);
}
