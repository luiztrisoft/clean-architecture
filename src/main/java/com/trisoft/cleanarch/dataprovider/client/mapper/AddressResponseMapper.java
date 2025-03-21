package com.trisoft.cleanarch.dataprovider.client.mapper;

import com.trisoft.cleanarch.core.domain.Address;
import com.trisoft.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
