package com.kit.my.elice.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Category {
    private String food_type;
    private String description;

    @Builder
    public Category(String food_type, String description) {
        this.food_type = food_type;
        this.description = description;
    }
}
