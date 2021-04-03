package com.mcb.administration.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReviewDto {

    private long id;
    private String rating;

    private String description;

    private CourseDto course;

}
