package com.thetenthchevron.service;

import com.thetenthchevron.model.Person;

import java.util.List;

public interface PersonService {

    //region BASIC CRUD FUNCTIONS

    public Person save(Person person);

    public List<Person> getAll();

    public Person update(Person person);

    public void delete(Person person);

    //endregion

    //region ADVANCED CRUD FUNCTIONS

    public Person getById(Integer id);

    //endregion
}
