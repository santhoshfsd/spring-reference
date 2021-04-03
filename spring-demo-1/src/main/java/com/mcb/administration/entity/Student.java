package com.mcb.administration.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="student")
@Data
@NamedQuery(name="find_all_student", query = "select s from Student s")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_generator")
    @SequenceGenerator(name="student_generator", sequenceName = "student_seq")
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private long phoneNumber;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Passport passport;

//
//    join column std id
//    inverse join - cousr id

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name="STUDENT_COURSE",joinColumns = @JoinColumn(name="STUDENT_ID"),
//            inverseJoinColumns =  @JoinColumn(name="COURSE_ID")
//    )
//    private List<Course> course = new ArrayList<>();
}
