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
    @GetMapping("/Log")
    private List < Log > getAllLog() {
        return LogService.getAllLog();
    }
    
    //creating a get mapping that retrieves the detail of a specific Log  
    @GetMapping("/Log/{id}")
    private Log getLog(@PathVariable("id") int id) {
        return LogService.getLogById(id);
    }

//    //creating a delete mapping that deletes a specific Log  
//    @DeleteMapping("/Log/{id}")
//    private void deleteLog(@PathVariable("id") int id) {
//        LogService.delete(id);
//    }

    //creating post mapping that post the Log detail in the database  
    @PostMapping("/Log")
    private int saveLog(@RequestBody Log Log) {
        LogService.saveOrUpdate(Log);
        return Log.getId();
    }
}