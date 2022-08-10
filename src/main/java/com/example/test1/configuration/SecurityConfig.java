package com.example.test1.configuration;

import ch.qos.logback.core.encoder.Encoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().permitAll();

//        http.authorizeRequests()
//                .antMatchers("/bitcoin").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic();
//        http.authorizeRequests()
//                .antMatchers("/tether").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic();
////
//        http.authorizeRequests()
//                .antMatchers("/status")
//                .hasAuthority("admin")
//                .antMatchers("/hello")
//                .hasAuthority("admin");
//
//        http.authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin();
    }
}
//    @Bean
//    public UserDetailsService userDetailsService() {
//        InMemoryUserDetailsManager userDetailService = new InMemoryUserDetailsManager();
//
//        UserDetails user1 = User.withUsername("mary")
//                .password(passwordEncoder().encode("test"))
//                .authorities("read")
//                .build();
//        userDetailService.createUser(user1);
//
//        return userDetailService;
//    }
//
//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}