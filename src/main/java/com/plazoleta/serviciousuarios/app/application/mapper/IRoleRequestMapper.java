package com.plazoleta.serviciousuarios.app.application.mapper;

import com.plazoleta.serviciousuarios.app.application.dto.request.RoleRequestDto;
import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRoleRequestMapper {
    RoleModel toRole(RoleRequestDto roleRequestDto);
}
