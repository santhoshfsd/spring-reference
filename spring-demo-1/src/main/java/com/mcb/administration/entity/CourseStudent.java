package com.mcb.administration.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="course_student")
@Data
public class CourseStudent {

    @Id
    private int id;
    private Course course;
    private String student;
}
