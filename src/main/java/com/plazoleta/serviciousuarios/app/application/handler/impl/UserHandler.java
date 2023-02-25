package com.plazoleta.serviciousuarios.app.application.handler.impl;
import com.plazoleta.serviciousuarios.app.application.dto.request.UserRequestDto;
import com.plazoleta.serviciousuarios.app.application.dto.response.UserResponseDto;
import com.plazoleta.serviciousuarios.app.application.handler.IUserHandler;
import com.plazoleta.serviciousuarios.app.application.mapper.IUserRequestMapper;
import com.plazoleta.serviciousuarios.app.application.mapper.IUserResponseMapper;
import com.plazoleta.serviciousuarios.app.domain.api.IUserServicePort;
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
    public void saveUser(UserRequestDto userRequestDto) {
        userServicePort.saveUserModel(userRequestMapper.toUser(userRequestDto));
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return userResponseMapper.toUserResponseList(userServicePort.getAllUser());
    }
}
