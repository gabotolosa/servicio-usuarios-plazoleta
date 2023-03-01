package com.plazoleta.serviciousuarios.app.infrastructure.configuration;

import com.plazoleta.serviciousuarios.app.domain.api.IRoleServicePort;
import com.plazoleta.serviciousuarios.app.domain.api.IUserServicePort;
import com.plazoleta.serviciousuarios.app.domain.spi.IPersistencePort;
import com.plazoleta.serviciousuarios.app.domain.spi.IRolePersistencePort;
import com.plazoleta.serviciousuarios.app.domain.spi.IUserPersistencePort;
import com.plazoleta.serviciousuarios.app.domain.usecase.RoleUseCase;
import com.plazoleta.serviciousuarios.app.domain.usecase.UserUseCase;
import com.plazoleta.serviciousuarios.app.infrastructure.output.http.adapter.HttpAdapter;
import com.plazoleta.serviciousuarios.app.infrastructure.output.http.mapper.ILoginModelMapper;
import com.plazoleta.serviciousuarios.app.infrastructure.output.http.mapper.ISignupModelMapper;
import com.plazoleta.serviciousuarios.app.infrastructure.output.http.mapper.ITokenModelMapper;
import com.plazoleta.serviciousuarios.app.infrastructure.output.http.service.IUService;
import com.plazoleta.serviciousuarios.app.infrastructure.output.jpa.adapter.RoleJpaAdapter;
import com.plazoleta.serviciousuarios.app.infrastructure.output.jpa.adapter.UserJpaAdapter;
import com.plazoleta.serviciousuarios.app.infrastructure.output.jpa.mapper.IRoleEntityMapper;
import com.plazoleta.serviciousuarios.app.infrastructure.output.jpa.mapper.IUserEntityMapper;
import com.plazoleta.serviciousuarios.app.infrastructure.output.jpa.repository.IRoleRepository;
import com.plazoleta.serviciousuarios.app.infrastructure.output.jpa.repository.IUserRepository;
import com.plazoleta.serviciousuarios.app.infrastructure.security.JwtUtils;
import com.plazoleta.serviciousuarios.app.infrastructure.security.LoginInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration implements WebMvcConfigurer {

    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleEntityMapper;

    private final IUService service;
    private final ISignupModelMapper signupModelMapper;
    private final ILoginModelMapper loginModelMapper;
    private final ITokenModelMapper tokenModelMapper;


    @Bean
    public IPersistencePort persistencePort(){
        return new HttpAdapter(service, signupModelMapper,loginModelMapper, tokenModelMapper);
    }

    @Bean
    public IUserPersistencePort userPersistencePort(){

        return new UserJpaAdapter(userRepository, userEntityMapper);
    }

    @Bean
    public IRolePersistencePort rolePersistencePort(){
        return new RoleJpaAdapter(roleRepository, roleEntityMapper);
    }

    @Bean
    public IUserServicePort userServicePort(){

        return new UserUseCase(userPersistencePort(), persistencePort());
    }

    @Bean
    public IRoleServicePort roleServicePort(){

        return new RoleUseCase(rolePersistencePort());
    }

    @Bean
    public JwtUtils jwtUtils(){
        return new JwtUtils();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor(jwtUtils()))
                .addPathPatterns("/api/v1/**")
                .excludePathPatterns("/api/v1/user/login", "/api/v1/user/signup");
    }
}
