package com.plazoleta.serviciousuarios.app.application.mapper;

import com.plazoleta.serviciousuarios.app.application.dto.request.RoleRequestDto;
import com.plazoleta.serviciousuarios.app.application.dto.response.RoleResponseDto;
import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRoleResponseMapper {

    RoleRequestDto toRoleResponse(RoleModel roleModel);
    List<RoleResponseDto> toRoleResponseList(List<RoleModel> roleModelList);
}
