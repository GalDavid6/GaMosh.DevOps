package com.gamosh.controller;
import com.gamosh.service.LogService;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatabaseInitializer {
 
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Autowired
    private LogService logService;
    private static final Logger LOG = Logger.getLogger(DatabaseInitializer.class.getName());
    
    
    @EventListener
    public void seed(ContextRefreshedEvent event) {
        seedLogsTable();
    }
    
    private void seedLogsTable() {
    	logService.save("No Route", "DB Initialzer");
        LOG.info("Logs Seeded");
    }
}