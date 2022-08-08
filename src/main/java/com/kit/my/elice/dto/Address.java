package com.kit.my.elice.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Address {
    private int postalCode;
    private String streetAddress;
    private String detailAddress;

    @Builder
    public Address(int postalCode, String streetAddress, String detailAddress) {
        this.postalCode = postalCode;
        this.streetAddress = streetAddress;
        this.detailAddress = detailAddress;
    }
}
