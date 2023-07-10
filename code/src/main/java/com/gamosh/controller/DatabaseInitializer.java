package com.gamosh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;

@Configuration
public class DatabaseInitializer {
 
    @Autowired
    JdbcTemplate jdbcTemplate;
     
//    @Bean
//    CommandLineRunner loadDatabase() {
//        return new CommandLineRunner() { 
//            @Override
//            public void run(String... args) throws Exception {
//                jdbcTemplate.execute("create table Logs (id int primary key "
//                + "auto_increment, createAt String, route String, typeRequest String");
//            }
//        };
//    }
}