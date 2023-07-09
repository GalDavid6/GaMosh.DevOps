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
    LogRepository LogRepository;
    //getting all Log records  
    public List <Log> getAllLog() {
        List <Log> logs = new ArrayList <Log>();
        LogRepository.findAll().forEach(Log -> logs.add(Log));
        return logs;
    }
    //getting a specific record  
    public Log getLogById(int id) {
        return LogRepository.findById(id).get();
    }

    public void saveOrUpdate() {
    	Log log = new Log();
        LogRepository.save(log);
    }
    
//    public void delete(int id) {
//    	LogRepository.findById(id).get().delete(id);
//    }
}