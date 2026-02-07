package com.pedro.hexagonal.adapters.out;

import com.pedro.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.pedro.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.pedro.hexagonal.application.core.domain.Address;
import com.pedro.hexagonal.application.ports.out.FindAdressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAdressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
