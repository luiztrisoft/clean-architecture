package com.trisoft.cleanarch.config;

import com.trisoft.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.trisoft.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.trisoft.cleanarch.dataprovider.InsertCustomerImpl;
import com.trisoft.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }

}
