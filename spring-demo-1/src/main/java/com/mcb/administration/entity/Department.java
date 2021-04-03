package com.mcb.administration.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
@Data
public class Department {

    @Id
    private Long id;
    private String name;
    private String location;

}
