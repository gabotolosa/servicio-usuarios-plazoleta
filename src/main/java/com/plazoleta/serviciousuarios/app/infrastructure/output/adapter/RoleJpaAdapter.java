package com.plazoleta.serviciousuarios.app.infrastructure.output.adapter;

import com.plazoleta.serviciousuarios.app.domain.model.RoleModel;
import com.plazoleta.serviciousuarios.app.domain.spi.IRolePersistencePort;
import com.plazoleta.serviciousuarios.app.infrastructure.exception.NoDataFoundException;
import com.plazoleta.serviciousuarios.app.infrastructure.output.entity.RoleEntity;
import com.plazoleta.serviciousuarios.app.infrastructure.output.entity.UserEntity;
import com.plazoleta.serviciousuarios.app.infrastructure.output.mapper.IRoleEntityMapper;
import com.plazoleta.serviciousuarios.app.infrastructure.output.repository.IRoleRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class RoleJpaAdapter implements IRolePersistencePort {

    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleEntityMapper;

    @Override
    public void saveRole(RoleModel roleModel) {
        RoleEntity role = roleRepository.save(roleEntityMapper.toEntityRole(roleModel));
        roleEntityMapper.toRoleModel(role);
    }

    @Override
    public List<RoleModel> getAllRole() {

        List<RoleEntity> entityList = roleRepository.findAll();
        if (entityList.isEmpty()){
            throw new NoDataFoundException();
        }
        return roleEntityMapper.toRoleModelList(entityList);
    }
}
