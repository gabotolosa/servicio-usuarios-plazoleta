package com.plazoleta.serviciousuarios.app.application.mapper;

import com.plazoleta.serviciousuarios.app.application.dto.response.UserResponseDto;
import com.plazoleta.serviciousuarios.app.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserResponseMapper {

    UserResponseDto toUserResponse(UserModel userModel);
    List<UserResponseDto> toUserResponseList(List<UserModel> userModelList);
}
