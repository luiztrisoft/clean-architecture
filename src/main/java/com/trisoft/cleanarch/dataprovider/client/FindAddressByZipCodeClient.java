package com.trisoft.cleanarch.dataprovider.client;

import com.trisoft.cleanarch.dataprovider.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
    name = "FindAddressByZipCodeClient",
    url = "${trisoft.client.address.url}"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);

}
