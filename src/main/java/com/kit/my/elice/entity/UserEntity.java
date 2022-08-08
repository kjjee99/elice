package com.kit.my.elice.entity;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.kit.my.elice.dto.Address;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.Builder;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@TypeDef(name = "json",typeClass = JsonStringType.class)
@Table(name="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int user_id;
    @Column(name="email")
    private String email;
    @Column(name="full_name")
    private String full_name;
    @Column(name="password")
    private String password;
    @Column(name = "phone_number")
    private String phone_number;
    @Type(type="json")
    @Column(name="address", columnDefinition = "json")
    private Address address;
    @Column(name="role")
    private String role;


    @Builder
    public UserEntity(int user_id, String email, String full_name, String password, String phone_number, Address address, String role) {
        this.user_id = user_id;
        this.email = email;
        this.full_name = full_name;
        this.password = password;
        this.phone_number = phone_number;
        this.address = Address.builder().postalCode(address.getPostalCode())
                        .streetAddress(address.getStreetAddress())
                        .detailAddress(address.getDetailAddress()).build();
        this.role = role;
    }
}
