package com.ankitrj3.roggers.springsecurity.config;


import org.springframework.security.core.userdetails.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringConfig {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        
        http.
            csrf(customizer->customizer.disable())//this will disable csrf
             //this will allow all the request to be authenticated
            .authorizeHttpRequests(requests -> requests.anyRequest().authenticated())
            .formLogin(Customizer.withDefaults())//implementing form login in browser
            .httpBasic(Customizer.withDefaults())//implementing basic authentication in postman
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));//this will make the session stateless

        return http.build();
    }
    
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user1 = User
                   .withDefaultPasswordEncoder()
                   .username("user1")
                   .password("password")
                   .roles("USER")
                   .build();
        
        return new InMemoryUserDetailsManager(user1);
    }

     
}
