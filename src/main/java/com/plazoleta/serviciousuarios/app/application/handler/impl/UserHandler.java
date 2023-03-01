package com.plazoleta.serviciousuarios.app.application.handler.impl;

import com.plazoleta.serviciousuarios.app.application.dto.request.UserLoginRequestDto;
import com.plazoleta.serviciousuarios.app.application.dto.request.UserSignupRequestDto;
import com.plazoleta.serviciousuarios.app.application.dto.response.UserLoginResponseDto;
import com.plazoleta.serviciousuarios.app.application.dto.response.UserResponseDto;
import com.plazoleta.serviciousuarios.app.application.handler.IUserHandler;
import com.plazoleta.serviciousuarios.app.application.mapper.IUserRequestMapper;
import com.plazoleta.serviciousuarios.app.application.mapper.IUserResponseMapper;
import com.plazoleta.serviciousuarios.app.domain.api.IUserServicePort;
import com.plazoleta.serviciousuarios.app.domain.model.Token;
import com.plazoleta.serviciousuarios.app.domain.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserHandler implements IUserHandler {

    private final IUserServicePort userServicePort;
    private final IUserRequestMapper userRequestMapper;
    private final IUserResponseMapper userResponseMapper;

    @Override
    public UserLoginResponseDto loginUser(UserLoginRequestDto userLoginRequestDto) {
        UserModel user = userRequestMapper.toUser(userLoginRequestDto);
        Token token = userServicePort.loginUser(user);
        return userResponseMapper.toResponse(token);
    }

    @Override
    public void saveUser(UserSignupRequestDto userSignupRequestDto) {
        UserModel userModel = userRequestMapper.toUser(userSignupRequestDto);
        userResponseMapper.toResponse(userServicePort.saveUser(userModel));
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return userResponseMapper.toResponseList(userServicePort.getAllUsers());
    }

    @Override
    public UserResponseDto getUserByEmail(String email) {
        return userResponseMapper.toResponse(userServicePort.getUserByEmail(email));
    }

    @Override
    public void deleteUser(Long userId) {
        userServicePort.deleteUser(userId);
    }
}