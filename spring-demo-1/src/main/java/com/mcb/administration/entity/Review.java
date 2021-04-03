package com.mcb.administration.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "review_generator")
    @SequenceGenerator(name="review_generator", sequenceName = "review_seq")
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    private String rating;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;

}
