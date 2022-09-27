package com.works.securityjwt.repositories;

import com.works.securityjwt.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRespository extends JpaRepository<Role,Long> {
}
