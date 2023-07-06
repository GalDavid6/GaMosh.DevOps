package com.gamosh.repository;
import org.springframework.data.repository.CrudRepository;  
import com.gamosh.model.Log;
public interface LogRepository extends CrudRepository<Log, Integer>  
{  
    
}