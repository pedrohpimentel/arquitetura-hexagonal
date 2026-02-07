package com.pedro.hexagonal.application.core.usecase;

import com.pedro.hexagonal.application.core.domain.Customer;
import com.pedro.hexagonal.application.ports.out.FindAdressByZipCodeOutputPort;
import com.pedro.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {

    private final FindAdressByZipCodeOutputPort findAdressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAdressByZipCodeOutputPort findAdressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAdressByZipCodeOutputPort = findAdressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode) {
        var address = findAdressByZipCodeOutputPort.find(zipCode);
        customer.setAdress(address);
        insertCustomerOutputPort.insert(customer);

    }
}
