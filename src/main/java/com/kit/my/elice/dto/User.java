package com.kit.my.elice.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class User {
    private String email;
    private String full_name;
    private String password;
    private String phone_number;
//    private Address address;
    private String address;

    @Builder
    public User(String email, String full_name, String password, String phone_number, String address) {
        this.email = email;
        this.full_name = full_name;
        this.password = password;
        this.phone_number = phone_number;
//        this.address = Address.builder().postalCode(address.getPostalCode())
//                        .streetAddress(address.getStreetAddress())
//                        .detailAddress(address.getDetailAddress()).build();
        this.address = address;
    }
}
