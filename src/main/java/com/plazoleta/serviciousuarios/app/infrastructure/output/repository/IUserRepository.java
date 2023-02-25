package com.plazoleta.serviciousuarios.app.infrastructure.output.repository;
import com.plazoleta.serviciousuarios.app.infrastructure.output.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.Optional;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {
    //derivacion metodo

    //Optional<UserEntity> findByRoleId(Long id);
    //Optional<UserEntity> findByEmail(String email);
    //Optional<UserEntity> findByEmailAndPassword(String email, String password);
}
