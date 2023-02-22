package com.work22022023.springweb.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        //Used for Security Authorization
        http.authorizeHttpRequests(
                auth -> auth.anyRequest().authenticated()
        );
        //Used for Basic Authentication
        http.httpBasic(Customizer.withDefaults());
        //Used for enable POST and PUT method without authorization
        http.csrf().disable();
        return http.build();
    }
}
