package com.thetenthchevron.service;

import com.thetenthchevron.model.Appointment;

import java.util.List;

public interface AppointmentService {

//region BASIC CRUD FUNCTIONS

    public Appointment save(Appointment appointment); //POST

    public List<Appointment> getAll();  //GET

    public Appointment update(Appointment appointment);  //PUT

    public void delete(Appointment appointment); //DELETE

    //endregion

    //region ADVANCED CRUD FUNCTIONS

    public Appointment getById(Integer id);  //GET

    //endregion
}
