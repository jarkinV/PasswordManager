package com.github.jarkinv.passwordmanager.repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.github.jarkinv.passwordmanager.domain.StateEnum;
import org.springframework.stereotype.Repository;

@SuppressWarnings("JpaQlInspection")
@Repository
public class CustomizedStateRepositoryImpl implements CustomizedStateRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public StateEnum getLastStateByUserId(Integer userId) {
        String sql = "select s.stateEnum from State s where s.userId = :userId order by s.dateTime desc ";
        TypedQuery<StateEnum> query = entityManager.createQuery(sql, StateEnum.class);
        query.setMaxResults(1);
        query.setParameter("userId", userId);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return StateEnum.START;
        }
    }

    @Override
    public String getLastTempByUserIdAndStateEnum(Integer userId, StateEnum stateEnum) {
        String sql = "select s.temp from State s where s.userId = :userId "
                + "and s.stateEnum = :stateEnum order by s.dateTime desc ";
        TypedQuery<String> query = entityManager.createQuery(sql, String.class);
        query.setMaxResults(1);
        query.setParameter("userId", userId);
        query.setParameter("stateEnum", stateEnum);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
