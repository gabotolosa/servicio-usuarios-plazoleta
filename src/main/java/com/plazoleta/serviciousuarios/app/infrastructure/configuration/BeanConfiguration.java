package com.plazoleta.serviciousuarios.app.infrastructure.configuration;

import com.plazoleta.serviciousuarios.app.domain.api.IRoleServicePort;
import com.plazoleta.serviciousuarios.app.domain.api.IUserServicePort;
import com.plazoleta.serviciousuarios.app.domain.spi.IRolePersistencePort;
import com.plazoleta.serviciousuarios.app.domain.spi.IUserPersistencePort;
import com.plazoleta.serviciousuarios.app.domain.usecase.RoleUseCase;
import com.plazoleta.serviciousuarios.app.domain.usecase.UserUseCase;
import com.plazoleta.serviciousuarios.app.infrastructure.output.adapter.RoleJpaAdapter;
import com.plazoleta.serviciousuarios.app.infrastructure.output.adapter.UserJpaAdapter;
import com.plazoleta.serviciousuarios.app.infrastructure.output.mapper.IRoleEntityMapper;
import com.plazoleta.serviciousuarios.app.infrastructure.output.mapper.IUserEntityMapper;
import com.plazoleta.serviciousuarios.app.infrastructure.output.repository.IRoleRepository;
import com.plazoleta.serviciousuarios.app.infrastructure.output.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleEntityMapper;

    @Bean
    public IUserPersistencePort userPersistencePort() {
        return new UserJpaAdapter(userRepository, userEntityMapper);
    }

    @Bean
    public IUserServicePort userServicePort() {
        return new UserUseCase(userPersistencePort());
    }

    @Bean
    public IRolePersistencePort rolePersistencePort(){
        return new RoleJpaAdapter(roleRepository, roleEntityMapper);
    }

    @Bean
    public IRoleServicePort roleServicePort(){
        return new RoleUseCase(rolePersistencePort());
    }

}
