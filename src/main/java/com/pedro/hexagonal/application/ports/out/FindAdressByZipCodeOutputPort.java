package com.pedro.hexagonal.application.ports.out;

import com.pedro.hexagonal.application.core.domain.Adress;

public interface FindAdressByZipCodeOutputPort {

    Adress find (String zipCode);

}
