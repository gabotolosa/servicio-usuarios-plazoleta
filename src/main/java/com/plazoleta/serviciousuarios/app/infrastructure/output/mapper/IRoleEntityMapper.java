package com.plazoleta.serviciousuarios.app.infrastructure.output.mapper;
import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;
import com.plazoleta.serviciousuarios.app.infrastructure.output.entity.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRoleEntityMapper {

    RoleEntity toEntityRole(RoleModel roleModel);
    RoleModel toRoleModel(RoleEntity roleEntity);
    List<RoleModel> toRoleModelList(List<RoleEntity> roleEntityList);
}
