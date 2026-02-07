package com.pedro.hexagonal.application.ports.out;

import com.pedro.hexagonal.application.core.domain.Address;

public interface FindAdressByZipCodeOutputPort {

    Address find (String zipCode);

}
