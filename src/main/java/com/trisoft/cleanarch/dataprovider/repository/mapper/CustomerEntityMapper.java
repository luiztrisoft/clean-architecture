package com.trisoft.cleanarch.dataprovider.repository.mapper;

import com.trisoft.cleanarch.core.domain.Customer;
import com.trisoft.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
