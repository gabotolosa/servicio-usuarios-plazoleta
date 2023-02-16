package com.plazoleta.serviciousuarios.app.infrastructure.configuration;

import com.plazoleta.serviciousuarios.app.domain.api.IUserServicePort;
import com.plazoleta.serviciousuarios.app.domain.spi.IUserPersistencePort;
import com.plazoleta.serviciousuarios.app.domain.usecase.UserUseCase;
import com.plazoleta.serviciousuarios.app.infrastructure.output.adapter.UserJpaAdapter;
import com.plazoleta.serviciousuarios.app.infrastructure.output.mapper.IUserEntityMapper;
import com.plazoleta.serviciousuarios.app.infrastructure.output.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    @Bean
    public IUserPersistencePort objectPersistencePort() {
        return new UserJpaAdapter(userRepository, userEntityMapper);
    }

    @Bean
    public IUserServicePort objectServicePort() {

        return new UserUseCase(objectPersistencePort());
    }

}
