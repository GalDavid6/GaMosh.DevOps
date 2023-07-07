package com.gamosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gamosh.model.Log;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LogRepository extends JpaRepository<Log, Long>
{
    List<Log> findAll();
}