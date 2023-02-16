package com.plazoleta.serviciousuarios.app.infrastructure.output.mapper;

import com.plazoleta.serviciousuarios.app.domain.model.UserModel;
import com.plazoleta.serviciousuarios.app.infrastructure.output.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserEntityMapper {

    UserEntity toEntity(UserModel userModel);
    UserModel toUserModel(UserEntity user);
    List<UserModel> toUserModelList(List<UserEntity> userEntityList);
}
