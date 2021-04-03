package com.mcb.administration.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="instructor")
public class Instructor {

    @Id
    private int id;
    private String departmentName;
    private String headedBy;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
