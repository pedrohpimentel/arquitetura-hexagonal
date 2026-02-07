package com.pedro.hexagonal.adapters.out.client.mapper;

import com.pedro.hexagonal.adapters.out.client.response.AddressResponse;
import com.pedro.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress (AddressResponse addressResponse);

}
