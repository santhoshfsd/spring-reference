package com.mcb.administration.dao.course;

import com.mcb.administration.AdministrationApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = AdministrationApplication.class)

class CourseJPQLRepositoryTest {

    @Autowired
    EntityManager em;

    @Test
    void findById() {
        List list = em.createQuery("Select c from Course c").getResultList();
        System.out.println(list.size());
    }

}