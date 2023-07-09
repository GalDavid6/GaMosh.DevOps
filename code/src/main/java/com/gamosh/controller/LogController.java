package com.gamosh.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gamosh.model.Log;
import com.gamosh.service.LogService;

@RestController
public class LogController {
    //auto wired the LogService class  
    @Autowired
    LogService LogService;
    //creating a get mapping that retrieves all the Logs detail from the database   
    @GetMapping("/log")
    private List<Log> getAllLog() {
       	return LogService.getAllLog();
    }
    
    @GetMapping("/transaction")
    private String transaction() {
    	LogService.saveOrUpdate();
    	return "Saved new log";
    }
    
    // ("/logs")

    
    // (
}