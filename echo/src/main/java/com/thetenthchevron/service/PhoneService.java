package com.thetenthchevron.service;

import com.thetenthchevron.model.Phone;

import java.util.List;

public interface PhoneService {

//region BASIC CRUD FUNCTIONS

    public Phone save(Phone phone);

    public List<Phone> getAll();

    public Phone update(Phone phone);

    public void delete(Phone phone);

    //endregion

    //region ADVANCED CRUD FUNCTIONS

    public Phone getById(Integer id);

    //endregion
}
