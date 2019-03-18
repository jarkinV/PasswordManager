package com.github.jarkinv.passwordmanager.repository;

import com.github.jarkinv.passwordmanager.domain.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url, Long> {
    Url getByUrlAndUserId(String url, Integer userId);
}
