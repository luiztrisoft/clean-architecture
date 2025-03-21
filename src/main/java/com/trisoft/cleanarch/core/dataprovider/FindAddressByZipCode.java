package com.trisoft.cleanarch.core.dataprovider;

import com.trisoft.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);

}
