package com.github.jarkinv.passwordmanager.service;

import java.util.Objects;

import com.github.jarkinv.passwordmanager.domain.Url;
import com.github.jarkinv.passwordmanager.repository.UrlRepository;
import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    @Autowired
    private UrlRepository urlRepository;

    @Autowired
    private UrlValidator urlValidator;

    public Url save(Url url) {
        return urlRepository.save(url);
    }

    public Url getByUrlAndUserId(String url, Integer userId) {
        return urlRepository.getByUrlAndUserId(url, userId);
    }

    public void createUrlIfNeeded(String url, Integer userId) {
        if (urlValidator.isValid(url)) {
            Url byUrlAndUserId = getByUrlAndUserId(url, userId);
            if (Objects.isNull(byUrlAndUserId)) {
                save(new Url(url, userId));
            }
        }
    }
}
