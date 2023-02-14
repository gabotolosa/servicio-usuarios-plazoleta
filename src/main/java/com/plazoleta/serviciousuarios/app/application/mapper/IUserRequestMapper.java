package com.plazoleta.serviciousuarios.app.application.mapper;

import com.plazoleta.serviciousuarios.app.application.dto.request.UserRequestDto;
import com.plazoleta.serviciousuarios.app.domain.model.UserModel;
import org.mapstruct.Mapper;

import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IUserRequestMapper {

    UserModel toUser(UserRequestDto userRequestDto);

}
