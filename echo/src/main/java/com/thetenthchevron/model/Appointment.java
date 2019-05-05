package com.thetenthchevron.model;

import javax.persistence.*;
import java.time.Duration;
import java.util.Date;
import java.util.List;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    private Date created;

    private Date lastModified;

    private Duration duration;

    @OneToOne(cascade = CascadeType.ALL)
    private Person customer;

    private String type;

    @OneToOne(cascade = CascadeType.ALL)
    private Address location;

    private String details;

    private String status;

    @OneToOne(cascade = CascadeType.ALL)
    private Person caretaker;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Task> tasksToPerform;

    public Appointment(){
        this.caretaker = new Person();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Person getCaretaker() {
        return caretaker;
    }

    public void setCaretaker(Person caretaker) {
        this.caretaker = caretaker;
    }

    public List<Task> getTasksToPerform() {
        return tasksToPerform;
    }

    public void setTasksToPerform(List<Task> tasksToPerform) {
        this.tasksToPerform = tasksToPerform;
    }
}
