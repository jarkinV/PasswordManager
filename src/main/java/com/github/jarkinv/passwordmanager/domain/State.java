package com.github.jarkinv.passwordmanager.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.OffsetDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id", nullable = false)
    @NonNull
    private Integer userId;
    @NonNull
    @Enumerated(EnumType.STRING)
    @Column(name = "state_enum", nullable = false)
    private StateEnum stateEnum;
    @Column(nullable = false)
    private OffsetDateTime dateTime = OffsetDateTime.now();
    private String temp;
}
