package com.filippov.spring.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // add our users for in memory authentication
// не выходит MVC на авторизацию!!!!!(((( ПОЧЕМУ!!! Пробовал через таблицы, и хардкодил.
        UserBuilder users = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication()
                .withUser(users.username("user").password("test123").roles("USER"))
                .withUser(users.username("manager").password("test123").roles("MANAGER"))
                .withUser(users.username("admin").password("test123").roles("ADMIN"));
    }



//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//
//        http
//                .authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers(HttpMethod.GET, "/user/{id}").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//                .httpBasic()
//                .and()
//                .csrf().disable();
//    }
//
//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                        .username("user")
//                        .password("password")
//                        .roles("USER")
//                        .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }


//        UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//        auth.inMemoryAuthentication()
//                .withUser(userBuilder
//                        .username("pavel").password("pavel")
//                        .roles("ADMIN"))
//                .withUser(userBuilder
//                        .username("user").password("user")
//                        .roles("USER"));

}
