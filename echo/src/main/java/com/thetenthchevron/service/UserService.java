package com.thetenthchevron.service;

import com.thetenthchevron.model.User;

import java.util.List;

public interface UserService {

//region BASIC CRUD FUNCTIONS

    public User save(User user);

    public List<User> getAll();

    public User update(User user);

    public void delete(User user);

    //endregion

    //region ADVANCED CRUD FUNCTIONS

    public User getById(Integer id);

    //endregion
}
