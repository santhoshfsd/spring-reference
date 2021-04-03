package com.mcb.administration.dao.course;

import com.mcb.administration.entity.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class CourseJpaRepository {

    private EntityManager em;

    public CourseJpaRepository(EntityManager em) {
        this.em = em;
    }

    public Course findById(int id) {
        return  em.find(Course.class,id);
    }

    public void deleteById(int id) {
        Course course = findById(id);
        em.remove(course);
    }

    public Course createOrUpdate(Course id) {

//            if(id.getId() == 0) {
//                em.persist(id);
//            } else {
//                em.merge(id);
//            }
        em.merge(id);
        return id;
    }

}
