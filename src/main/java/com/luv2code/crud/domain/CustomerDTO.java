package com.luv2code.crud.domain;


import lombok.Builder;

@Builder
public record CustomerDTO(
        String firstName,
        String lastName,
        String email
) {
    static CustomerDTO fromCustomer(Customer customer) {
        return CustomerDTO.builder()
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .email(customer.getEmail())
                .build();
    }
}
