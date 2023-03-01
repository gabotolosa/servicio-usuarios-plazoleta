package com.plazoleta.serviciousuarios.app.application.mapper;

import com.plazoleta.serviciousuarios.app.application.dto.request.UserLoginRequestDto;
import com.plazoleta.serviciousuarios.app.application.dto.request.UserSignupRequestDto;
import com.plazoleta.serviciousuarios.app.application.dto.response.UserLoginResponseDto;
import com.plazoleta.serviciousuarios.app.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserRequestMapper {
    UserModel toUser(UserLoginResponseDto userLoginResponseDto);
    UserModel toUser(UserLoginRequestDto userLoginRequestDto);
    UserModel toUser(UserSignupRequestDto userSignupRequestDto);
}
