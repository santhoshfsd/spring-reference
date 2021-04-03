package com.mcb.administration.dao;


import com.mcb.administration.entity.Student;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest(classes = com.mcb.administration.AdministrationApplication.class)
class StudentJpaRepositoryTest {

    @Autowired
    StudentJpaRepository jpaRepository;

    @Autowired
    EntityManager em;


    @Test
    @Transactional
    void findById() {
//        jpaRepository.retriveStudentAndPassport();

        Student student = em.find(Student.class, 1001L);

        Assert.assertEquals(student.getPassport().getNumber(),"E1200031");
    }
}