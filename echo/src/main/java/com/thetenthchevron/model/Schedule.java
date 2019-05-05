package com.thetenthchevron.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Appointment> appointments;

    //region Singleton

    private static final Schedule INSTANCE = new Schedule();

    private Schedule(){}

    public static Schedule getInstance() {
        return INSTANCE;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    //endregion

}
