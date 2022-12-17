package com.sisalmoxarife.backend.providers;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class GenerateHashProvider {
    public String generateHash(final String value){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(value);
    }
}
