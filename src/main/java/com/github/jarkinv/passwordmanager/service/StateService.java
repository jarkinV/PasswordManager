package com.github.jarkinv.passwordmanager.service;

import com.github.jarkinv.passwordmanager.domain.State;
import com.github.jarkinv.passwordmanager.domain.StateEnum;
import com.github.jarkinv.passwordmanager.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public StateEnum getCurrentStateByUserId(Integer userId) {
        return stateRepository.getLastStateByUserId(userId);
    }

    public String getLastTempByUserIdAndStateEnum(Integer userId, StateEnum stateEnum) {
        return stateRepository.getLastTempByUserIdAndStateEnum(userId, stateEnum);
    }

    public State save(State state) {
        return stateRepository.save(state);
    }
}
