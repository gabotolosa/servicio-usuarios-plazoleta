package com.plazoleta.serviciousuarios.app.infrastructure.output.adapter;

import com.plazoleta.serviciousuarios.app.domain.model.UserModel;
import com.plazoleta.serviciousuarios.app.domain.spi.IUserPersistencePort;
import com.plazoleta.serviciousuarios.app.infrastructure.exception.NoDataFoundException;
import com.plazoleta.serviciousuarios.app.infrastructure.output.entity.UserEntity;
import com.plazoleta.serviciousuarios.app.infrastructure.output.mapper.IUserEntityMapper;
import com.plazoleta.serviciousuarios.app.infrastructure.output.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.ap.shaded.freemarker.core.NonDateException;

import java.util.List;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {

    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    @Override
    public UserModel saveUserModel(UserModel userModel) {
        return userEntityMapper.toUserModel(userRepository.save(
                userEntityMapper.toEntity(userModel)
        ));
    }

    @Override
    public List<UserModel> getAllUser() {
        List<UserEntity> entityList = userRepository.findAll();
        if (entityList.isEmpty()){
            throw new NoDataFoundException();
        }
        return userEntityMapper.toUserModelList(entityList);
    }
}
