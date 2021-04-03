package com.mcb.administration.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class CourseDto {
    private String departmentName;
    private int instructorId;
    private int duration;
    private String name;
    private List<ReviewDto> reviewList = new ArrayList<>();
}

