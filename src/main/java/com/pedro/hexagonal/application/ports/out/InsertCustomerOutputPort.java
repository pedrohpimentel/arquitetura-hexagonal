package com.pedro.hexagonal.application.ports.out;

import com.pedro.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
