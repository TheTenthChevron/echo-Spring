package com.thetenthchevron.service;

import com.thetenthchevron.model.Address;

import java.util.List;

public interface AddressService {

    //region BASIC CRUD FUNCTIONS

    public Address save(Address address);  //POST

    public List<Address> getAll();  //GET

    public void delete(Address address); //DELETE

    //endregion

    //region ADVANCED CRUD FUNCTIONS

    public Address getById(Integer id);  //GET

    //endregion
}
