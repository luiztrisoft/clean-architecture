package com.trisoft.cleanarch.core.dataprovider;

import com.trisoft.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);

}
