package com.thetenthchevron.service;

import com.thetenthchevron.model.Task;

import java.util.List;

public interface TaskService {

//region BASIC CRUD FUNCTIONS

    public Task save(Task task);

    public List<Task> getAll();

    public Task update(Task task);

    public void delete(Task task);

    //endregion

    //region ADVANCED CRUD FUNCTIONS

    public Task getById(Integer id);

    //endregion
}
