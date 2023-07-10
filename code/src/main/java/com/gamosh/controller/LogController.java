package com.gamosh.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gamosh.model.Log;
import com.gamosh.service.LogService;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class LogController {
    //auto wired the LogService class  
    @Autowired
    LogService logService;
    
	@GetMapping("")
	public String index() { 
		logService.save("/");
		return "Welcome to our Spring-Boot Application!";
	}
    
    //creating a get mapping that retrieves all the Logs detail from the database   
    @GetMapping("/logs")
    private List<Log> getAllLog() {
    	logService.save("/logs");
       	return logService.getAllLog();
    }    
    
    @GetMapping("/transaction")
    private String transaction() {
    	logService.save("/transaction");
    	return "New transaction have been made!";
    }
}