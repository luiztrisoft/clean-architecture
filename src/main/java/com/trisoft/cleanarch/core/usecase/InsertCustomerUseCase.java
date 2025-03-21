package com.trisoft.cleanarch.core.usecase;

import com.trisoft.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);

}
