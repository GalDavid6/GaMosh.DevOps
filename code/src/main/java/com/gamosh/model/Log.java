package com.gamosh.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "LOG")
public class Log {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long log_id;

    @Column
    private String message;

    @Column
    private String typeRequest;

    @Column
    private String routing;

    @Column
    private LocalDateTime createAt;

    public long getId() {
        return log_id;
    }
    public void setId(int id) {
        this.log_id = id;
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
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

}