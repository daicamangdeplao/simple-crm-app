package com.luv2code.crud.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerDTOTest {

    @Test
    void fromCustomer_should_return_customer_dto_instance() {
        CustomerDTO customerDTO = CustomerDTO.fromCustomer(Customer.builder()
                .id(1)
                .firstName("Joe")
                .lastName("Doe")
                .email("joe.doe@mail.com")
                .build());

        assertThat(customerDTO).isEqualTo(CustomerDTO.builder()
                .firstName("Joe")
                .lastName("Doe")
                .email("joe.doe@mail.com")
                .build());
    }

}