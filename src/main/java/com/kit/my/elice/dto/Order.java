package com.kit.my.elice.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Order {
    private int user_id;
    private String full_name;
    private String phone_number;
    private Address address;
    private List<Product> products;
    private String status;
    private int total_price;

    @Builder
    public Order(int user_id, String full_name, String phone_number, Address address, List<Product> products, String status, int total_price) {
        this.user_id = user_id;
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.address = address;
        this.products = products;
        this.status = status;
        this.total_price = total_price;
    }
}
