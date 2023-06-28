package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Log;
import com.javatpoint.repository.LogRepository;
@Service
public class LogService {
    @Autowired
    LogRepository LogRepository;
    //getting all Log records  
    public List <Log> getAllLog() {
        List <Log> Logs = new ArrayList <Log>();
        LogRepository.findAll().forEach(Log -> Logs.add(Log));
        return logs;
    }
    //getting a specific record  
    public Log getLogById(int id) {
        return LogRepository.findById(id).get();
    }

    public void saveOrUpdate(Log Log) {
        LogRepository.save(Log);
    }
}