package com.github.jarkinv.passwordmanager.repository;

import com.github.jarkinv.passwordmanager.domain.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {
}
