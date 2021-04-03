package com.mcb.administration.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="course")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_generator")
    @SequenceGenerator(name="course_generator", sequenceName = "course_seq")
    @Column(name = "id", updatable = false, nullable = false)
    private int id;
    private String departmentName;
    private int instructorId;
    private int duration;
    private String name;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="COURSE_ID")
    private List<Review> reviewList = new ArrayList<Review>();

//    @ManyToMany(mappedBy = "course",cascade = CascadeType.ALL)
//    private List<Student> student= new ArrayList<>();

}
