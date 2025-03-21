package com.trisoft.cleanarch.core.usecase;

import com.trisoft.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);

}
