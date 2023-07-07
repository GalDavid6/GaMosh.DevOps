package com.gamosh.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table
public class Log {

    @Id
    @Column
    private final int log_id; 

    @Column
    private String message;

    @Column
    private String typeRequest;

    @Column
    private String routing;

    @Column
    private final LocalDateTime createAt;
    
    public static int counter = 0;
    
    Log() {
    	this.log_id = counter++;
    	this.createAt = LocalDateTime.now();
    }

    public int getId() {
        return log_id;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getTypeRequest() {
        return typeRequest;
    }
    public void setTypeRequest(String typeRequest) {
        this.typeRequest = typeRequest;
    }
    
    public String getRouting() {
        return routing;
    }
    public void setRouting(String routing) {
        this.routing = routing;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }
}