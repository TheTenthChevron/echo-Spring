package com.thetenthchevron.model;

import com.thetenthchevron.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements ApplicationRunner {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        addressRepository.save(Address.builder().houseNumber(4583).addressLineOne("Cedar Avenue").addressLineTwo("").city("Minneapolis").stateAbbreviation("MN").zipCode("55398").residential(true).build());
        addressRepository.save(Address.builder().houseNumber(3662).addressLineOne("Broadway Avenue").addressLineTwo("").city("Minneapolis").stateAbbreviation("MN").zipCode("55354").residential(true).build());
        addressRepository.save(Address.builder().houseNumber(102).addressLineOne("Selby Avenue").addressLineTwo("").city("Minneapolis").stateAbbreviation("MN").zipCode("55324").residential(true).build());
    }
}
