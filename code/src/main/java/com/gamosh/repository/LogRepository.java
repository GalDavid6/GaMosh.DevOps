package com.gamosh.repository; 
import org.springframework.data.jpa.repository.JpaRepository;
import com.gamosh.model.Log;
public interface LogRepository extends JpaRepository<Log, Integer>  
{  
    
}