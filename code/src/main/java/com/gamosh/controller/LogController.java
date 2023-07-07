package com.gamosh.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gamosh.model.Log;
import com.gamosh.service.LogService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping("/")
    private List<Log> getAllLog() {
        return logService.getAllLog();
    }

    /*
    //creating a get mapping that retrieves the detail of a specific Log  
    @GetMapping("/Log/{id}")
    private Log getLog(@PathVariable("id") long id) {
        return logService.getLogById(id);
    }

    //creating post mapping that post the Log detail in the database  
    @PostMapping("/Log")
    private long saveLog(@RequestBody Log Log) {
        logService.saveOrUpdate(Log);
        return Log.getId();
    }
    */

}