package com.thetenthchevron.service.implementation;

import com.thetenthchevron.model.Address;
import com.thetenthchevron.repository.AddressRepository;
import com.thetenthchevron.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public void delete(Address address) {
        addressRepository.delete(address);
    }

    @Override
    public Address getById(Integer id) {
        return addressRepository.findById(id).get();
    }
}
