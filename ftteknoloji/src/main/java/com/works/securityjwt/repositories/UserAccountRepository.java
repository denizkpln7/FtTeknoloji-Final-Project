package com.works.securityjwt.repositories;

import com.works.securityjwt.entities.UserAccount;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserAccountRepository extends JpaRepository<UserAccount,Long> {
    List<UserAccount> findByUserıd(Long userıd, Pageable pageable);
}
