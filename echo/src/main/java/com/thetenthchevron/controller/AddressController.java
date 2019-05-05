package com.thetenthchevron.controller;

import com.thetenthchevron.model.Address;
import com.thetenthchevron.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;


    AddressController() { }

    @GetMapping("addresses")
    public List<Address> all(){
        return addressService.getAll();
    }

    @GetMapping("/addresses/{id}")
    public Address one(@PathVariable Integer id){

        Address address = addressService.getById(id);
        return address;
    }

    @PostMapping("/addresses")
    @ResponseStatus(HttpStatus.CREATED)
    public Address newAddress(@RequestBody Address newAddress){
        return addressService.save(newAddress);
    }

    @PutMapping("/addresses/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Address update(@RequestBody Address newAddress, @PathVariable Integer id){
        Address original = addressService.getById(id);
        if(newAddress.getHouseNumber() != null){original.setHouseNumber(newAddress.getHouseNumber()); }
        if(newAddress.getAddressLineOne() != null){original.setAddressLineOne(newAddress.getAddressLineOne()); }
        if(newAddress.getAddressLineTwo() != null){original.setAddressLineTwo(newAddress.getAddressLineTwo()); }
        if(newAddress.getCity() != null){original.setCity(newAddress.getCity()); }
        if(newAddress.getStateAbbreviation() != null){original.setStateAbbreviation(newAddress.getStateAbbreviation()); }
        if(newAddress.getZipCode() != null){original.setZipCode(newAddress.getZipCode()); }
        if(newAddress.getResidential() != null){original.setResidential(newAddress.getResidential()); }
        addressService.save(original);
        return original;
    }

    @DeleteMapping("/addresses/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Integer id){
        addressService.delete(addressService.getById(id));
    }
}
