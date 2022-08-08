package com.kit.my.elice.service;

import com.kit.my.elice.dto.Address;
import com.kit.my.elice.entity.UserEntity;
import com.kit.my.elice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository repository;

    public void addUser(Map<String, Object> user){
        try{
            UserEntity entity = UserEntity.builder()
                    .email("aaa2@elice.io")
                    .full_name("aaaa")
                    .password("1234")
                    .phone_number("010-0000-1111")
                    .address(Address.builder().postalCode(1234).streetAddress("aaa").detailAddress("101").build())
                    .role("basic-user")
                    .build();
            repository.save(entity);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
