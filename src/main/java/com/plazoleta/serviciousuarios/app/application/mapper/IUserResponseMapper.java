package com.plazoleta.serviciousuarios.app.application.mapper;

import com.plazoleta.serviciousuarios.app.application.dto.response.UserLoginResponseDto;
import com.plazoleta.serviciousuarios.app.application.dto.response.UserResponseDto;
import com.plazoleta.serviciousuarios.app.domain.model.Token;
import com.plazoleta.serviciousuarios.app.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserResponseMapper {

    UserResponseDto toResponse(UserModel userModel);
    UserLoginResponseDto toResponse(Token token);
    List<UserResponseDto> toResponseList(List<UserModel> userModelList);
}
