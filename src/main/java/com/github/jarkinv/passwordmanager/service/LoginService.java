package com.github.jarkinv.passwordmanager.service;


import static org.passay.AllowedCharacterRule.ERROR_CODE;

import com.github.jarkinv.passwordmanager.domain.Login;
import com.github.jarkinv.passwordmanager.domain.Url;
import com.github.jarkinv.passwordmanager.repository.LoginRepository;
import org.jasypt.util.text.StrongTextEncryptor;
import org.passay.CharacterData;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public String createLogin(String username, String key, Url url) {
        StrongTextEncryptor textEncryptor = new StrongTextEncryptor();
        textEncryptor.setPassword(key);
        String generatedPassword = generatePassword();
        String encryptedPassword = textEncryptor.encrypt(generatedPassword);
        loginRepository.save(new Login(username, encryptedPassword, url));
        return generatedPassword;
    }

    public String generatePassword() {
        PasswordGenerator gen = new PasswordGenerator();
        CharacterRule lowerCaseRule = new CharacterRule(EnglishCharacterData.LowerCase);
        lowerCaseRule.setNumberOfCharacters(2);

        CharacterRule upperCaseRule = new CharacterRule(EnglishCharacterData.UpperCase);
        upperCaseRule.setNumberOfCharacters(2);

        CharacterRule digitRule = new CharacterRule(EnglishCharacterData.Digit);
        digitRule.setNumberOfCharacters(2);

        CharacterData specialChars = new CharacterData() {
            public String getErrorCode() {
                return ERROR_CODE;
            }

            public String getCharacters() {
                return "!@#$%^&*()_+";
            }
        };
        CharacterRule splCharRule = new CharacterRule(specialChars);
        splCharRule.setNumberOfCharacters(2);

        return gen.generatePassword(10, splCharRule, lowerCaseRule,
                                    upperCaseRule, digitRule);
    }

}
