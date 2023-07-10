package com.gamosh.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "Log")
public class Log {

//    @Id
//    @Column
//    private final int log_id; 
//
//    public static int counter = 0;
	
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;	
    
    @Column
    private String typeRequest = "GET";

    @Column
    private String routing;

    @Column
    private final String createAt;
    
//    public Log(String route) {
//    	this.log_id = counter++;
//    	LocalDateTime dateTime = LocalDateTime.now();
//    	DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//    	this.createAt =dateTime.format(formatDateTime);
//     	this.typeRequest = "GET";
//     	this.routing = route;
//    }
//    
//    public Log() {
//    	this.log_id = counter++;
//    	LocalDateTime dateTime = LocalDateTime.now();
//    	DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//    	this.createAt =dateTime.format(formatDateTime);
//     	this.typeRequest = "GET";
//     	this.routing = "None";
//    }
    
    public Log() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		this.createAt =dateTime.format(formatDateTime);
	 	this.routing = "None";
	}
 
    public Log(String route) {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		this.createAt =dateTime.format(formatDateTime);
	 	this.routing = route;
    }

//    public int getId() {
//        return log_id;
//    }
    
    public Integer getId() {
    	return this.id;
    }
    
    public String getType() {
    	return this.typeRequest;
    }
    public String getRoute() {
    	return this.routing;
    }
    public String getDateTime() {
    	return this.createAt;
    }
}