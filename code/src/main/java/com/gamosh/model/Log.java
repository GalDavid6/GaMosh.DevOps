package com.gamosh.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Datetime;

@Entity
@Table
public class Log {

    @Id
    @Column
    private int log_id; 

    @Column
    private String message;

    @Column
    private String typeRequest;

    @Column
    private String routing;

    @Column
    private Datetime createAt;

    public int getId() {
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

    public Datetime getCreateAt() {
        return createAt;
    }
    public void setCreateAt(Datetime createAt) {
        this.createAt = createAt;
    }

}