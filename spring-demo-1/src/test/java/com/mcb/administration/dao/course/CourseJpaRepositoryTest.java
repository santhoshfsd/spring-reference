package com.mcb.administration.dao.course;

import com.mcb.administration.AdministrationApplication;
import com.mcb.administration.entity.Course;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = AdministrationApplication.class)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CourseJpaRepositoryTest {

    @Autowired
    CourseJpaRepository repository;

    @Autowired
    EntityManager em;


    @Test
//    @Order(1)
    public void shouldReturnCourseForTheGivenId(){
        Course course = repository.findById(1);
        assertEquals("CSE",course.getDepartmentName());
    }

    @Test
//    @Order(2)
    @DirtiesContext
    public void shouldDeleteCourseForTheGivenId(){
         repository.deleteById(1);
        assertNull(repository.findById(1));
    }

    @Test
//    @Order(1)
    public void shouldCreateCourse(){

        Course course = new Course();
        course.setName("AI");
        course.setDepartmentName("IT");
        course.setInstructorId(2);
        course.setDuration(5);

        Course response = repository.createOrUpdate(course);
        assertNotEquals(response.getId(),0);

    }

}
