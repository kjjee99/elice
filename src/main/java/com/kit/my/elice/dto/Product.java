package com.kit.my.elice.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product {
    private String product_name;
    private String product_content;
    private String product_price;
    private String product_image;
    private String category;
    private float review_score;

    @Builder
    public Product(String product_name, String product_content, String product_price, String product_image, String category, float review_score) {
        this.product_name = product_name;
        this.product_content = product_content;
        this.product_price = product_price;
        this.product_image = product_image;
        this.category = category;
        this.review_score = review_score;
    }
}
