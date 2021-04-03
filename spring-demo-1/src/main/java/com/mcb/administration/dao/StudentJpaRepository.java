package com.mcb.administration.dao;

import com.mcb.administration.entity.Passport;
import com.mcb.administration.entity.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class StudentJpaRepository {

    @PersistenceContext
    EntityManager  entityManager;

    public List<Student> findAll(){
        TypedQuery student=  entityManager.createNamedQuery("find_all_student", Student.class);
        return student.getResultList();

    }

    public Student findById(Long id){
        return entityManager.find(Student.class, id);
    }
//
//    public int deleteById(String id) {
//        return template.update("delete from student where id=?", new Object[]{id});
//    }
//
//    public int insert(Student sd){
//        return template.update("INSERT INTO student(ID,FIRST_NAME, LAST_NAME,PHONE_NUMBER) VALUES (?,?,?,?);",
//                new Object[]{
//                        sd.getId(),
//                        sd.getFirstName(),
//                        sd.getLastName(),
//                        sd.getPhoneNumber()
//                });
//    }
//

    public Student insertOrUpdate(Student sd){
        return entityManager.merge(sd);
    }

    public Student saveStudentWithPassport(Student sd) {
//        Passport passport =  sd.getPassport();
//        entityManager.persist(passport);
//        Student student = new Student();
//        student.setFirstName("mike");
//        student.setLastName("D");
//        student.setPhoneNumber(461489461);
//        student.setPassport(passport);

    entityManager.merge(sd);
        return sd;
    }


}

