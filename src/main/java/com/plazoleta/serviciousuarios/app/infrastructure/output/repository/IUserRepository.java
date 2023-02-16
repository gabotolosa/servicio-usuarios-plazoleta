package com.plazoleta.serviciousuarios.app.infrastructure.output.repository;

import com.plazoleta.serviciousuarios.app.infrastructure.output.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long> {
    //derivacion metodo


}
