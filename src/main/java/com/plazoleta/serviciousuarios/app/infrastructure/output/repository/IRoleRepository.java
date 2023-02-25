package com.plazoleta.serviciousuarios.app.infrastructure.output.repository;
import com.plazoleta.serviciousuarios.app.infrastructure.output.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleEntity, Long> {

}
