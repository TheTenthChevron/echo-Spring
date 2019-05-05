package com.thetenthchevron.controller.exceptions;

public class AddressNotFoundException extends RuntimeException {

    public AddressNotFoundException(Integer id) {
        super("Could not find address " + id);
    }
}
