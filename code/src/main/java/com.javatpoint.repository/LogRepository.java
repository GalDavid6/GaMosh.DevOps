package com.javatpoint.repository;  
import org.springframework.data.repository.CrudRepository;  
import com.javatpoint.model.Log;  
public interface LogRepository extends CrudRepository<Log, Integer>  
{  
    
}