package com.baghaniya.springsecurity.repository;

import com.baghaniya.springsecurity.model.Role;
import com.baghaniya.springsecurity.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by RAHUL on Jul, 2018
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
