package com.trisoft.cleanarch.core.usecase;

import com.trisoft.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);

}
