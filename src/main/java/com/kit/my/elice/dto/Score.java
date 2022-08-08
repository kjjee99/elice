package com.kit.my.elice.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Score {
    private String user_id;
    private String order_id;
    private Product product;
    private float review_score;
    private Date ordered_at;

    @Builder
    public Score(String user_id, String order_id, Product product, float review_score, Date ordered_at) {
        this.user_id = user_id;
        this.order_id = order_id;
        this.product = product;
        this.review_score = review_score;
        this.ordered_at = ordered_at;
    }
}
