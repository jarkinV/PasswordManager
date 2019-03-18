package com.github.jarkinv.passwordmanager.repository;

import com.github.jarkinv.passwordmanager.domain.StateEnum;

public interface CustomizedStateRepository {
    StateEnum getLastStateByUserId(Integer userId);

    String getLastTempByUserIdAndStateEnum(Integer userId, StateEnum stateEnum);
}
