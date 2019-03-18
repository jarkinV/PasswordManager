package com.github.jarkinv.passwordmanager.repository;

import com.github.jarkinv.passwordmanager.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long>, CustomizedStateRepository {
}
