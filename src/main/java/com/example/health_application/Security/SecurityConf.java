package com.example.health_application.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConf {




    @Configuration
    @EnableWebSecurity
    public static class App1ConfigurationAdapter {

        @Bean
        public SecurityFilterChain adminSecurityFilterChain(HttpSecurity http) throws Exception {
            http
                    .securityMatcher("/admin*")
                    .authorizeHttpRequests(registry ->
                            registry.requestMatchers("/admin*").hasRole("ADMIN")
                    )
                    .formLogin(login ->
                            login
                                    .loginPage("/loginAdmin")
                                    .loginProcessingUrl("/admin_login")
                                    .failureUrl("/loginAdmin?error=loginError")
                                    .defaultSuccessUrl("/adminPage")
                    )
                    .logout(logout ->
                            logout
                                    .logoutUrl("/admin_logout")
                                    .logoutSuccessUrl("/protectedLinks")
                                    .deleteCookies("JSESSIONID")
                    )
                    .exceptionHandling(ex -> ex.accessDeniedPage("/403"))
                    .csrf(AbstractHttpConfigurer::disable);

            return http.build();
        }

        @Configuration
        @Order(2)
        public static class App2ConfigurationAdapter {

            @Bean
            public SecurityFilterChain adminSecurityFilterChain(HttpSecurity http) throws Exception {
                http
                        .securityMatcher("/user*")
                        .authorizeHttpRequests(registry ->
                                registry.requestMatchers("/user*").hasRole("USER")
                        )
                        .formLogin(login ->
                                login
                                        .loginPage("/loginUser")
                                        .loginProcessingUrl("/user_login")
                                        .failureUrl("/loginUser?error=loginError")
                                        .defaultSuccessUrl("/userPage")
                        )
                        .logout(logout ->
                                logout
                                        .logoutUrl("/user_logout")
                                        .logoutSuccessUrl("/protectedLinks")
                                        .deleteCookies("JSESSIONID")
                        )
                        .exceptionHandling(ex -> ex.accessDeniedPage("/403"))
                        .csrf(AbstractHttpConfigurer::disable);

                return http.build();
            }
        }
    }

}


