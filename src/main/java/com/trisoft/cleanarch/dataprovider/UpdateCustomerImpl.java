package com.trisoft.cleanarch.dataprovider;

import com.trisoft.cleanarch.core.domain.Customer;
import com.trisoft.cleanarch.core.dataprovider.UpdateCustomer;
import com.trisoft.cleanarch.dataprovider.repository.CustomerRepository;
import com.trisoft.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomer {

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
