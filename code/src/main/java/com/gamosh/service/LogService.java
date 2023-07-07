package com.gamosh.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gamosh.model.Log;
import com.gamosh.repository.LogRepository;

@Service
public class LogService {

    @Autowired
    private LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    //getting all Log records  
    public List<Log> getAllLog() {
        List<Log> logs = new ArrayList<>();
        logRepository.findAll().forEach(Log -> logs.add(Log));
        return logs;
    }
}