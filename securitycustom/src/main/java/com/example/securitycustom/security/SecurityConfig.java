package com.example.securitycustom.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    // method / bean to create users and their roles
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        UserDetails userAdmin = User.withUsername("Admin")
                .password("admin")
                .roles("ADMIN")
                .build();
        UserDetails userAlex = User.withUsername("Alex")
                .password("pass")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(userAdmin, userAlex);
    }

    // creating an instance of the password encryption service
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // method / bean to create the endpoint security control
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth ->
                // auth.requestMatchers("")
                // .permitAll()
                auth.requestMatchers(("/"))
                        .authenticated())
                .formLogin(
                        fl -> fl.successForwardUrl("/"))
                .logout(
                        lo -> lo.logoutSuccessUrl("/login"));
        return http.build();

    }

}
