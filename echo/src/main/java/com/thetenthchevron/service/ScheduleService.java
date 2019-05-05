package com.thetenthchevron.service;

import com.thetenthchevron.model.Schedule;

import java.util.List;

public interface ScheduleService {

//region BASIC CRUD FUNCTIONS

    public Schedule save(Schedule schedule);

    public List<Schedule> getAll();

    public Schedule update(Schedule schedule);

    public void delete(Schedule schedule);

    //endregion

    //region ADVANCED CRUD FUNCTIONS

    public Schedule getById(Integer id);

    //endregion
}
